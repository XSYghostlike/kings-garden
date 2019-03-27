// 17. Letter Combinations of a Phone Number

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Q17 {
    public List<String> letterCombinations(String digits) {
        int len = digits.length();
        int resultLen = 1;
        for (char c : digits.toCharArray()) {
            if (c == '7' || c == '9') {
                resultLen = resultLen * 4;
            } else {
                resultLen = resultLen * 3;
            }
        }
        if (resultLen == 1) {
            resultLen = 0;
        }

        List<String> result = new ArrayList<>(Collections.nCopies(resultLen, ""));

        int patternLen = resultLen;

        for (int i=0;i<len;i++) {
            int digit = digits.charAt(i) - 48;

            char c1;
            switch (digit) {
                case 8:
                    c1 = 116;
                    break;
                case 9:
                    c1 = 119;
                    break;
                default: c1 = (char)((digits.charAt(i) - 48) * 3 + 91);

            }
            char c2 = (char)(c1+1);
            char c3 = (char)(c1+2);
            char c4 = (char)(c1+3);

            int subBlockLen;
            switch (digit) {
                case 7:
                case 9:
                    subBlockLen = patternLen / 4;
                    break;
                default:
                    subBlockLen = patternLen / 3;
            }

            for (int j=0;j<resultLen;j=j+patternLen) {
               for (int n=0;n<subBlockLen;n++) {
                   result.set(j+n, result.get(j+n) + c1);
                   result.set(j+n+subBlockLen, result.get(j+n+subBlockLen) + c2);
                   result.set(j+n+subBlockLen*2, result.get(j+n+subBlockLen*2) + c3);
                   if (digit == 7 || digit == 9) {
                       result.set(j+n+subBlockLen*3, result.get(j+n+subBlockLen*3) + c4);
                   }
               }
            }

            if (digit == 7 || digit == 9) {
                patternLen = patternLen/4;
            } else {
                patternLen = patternLen/3;
            }
        }

        return result;
    }
}
