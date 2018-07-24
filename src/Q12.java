// 12. Integer to Roman

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Q12 {
    // input 1 - 3999.
    public String intToRoman(int num) {
        List<String> result = new ArrayList<>();

        result.add(generate(num % 10, "I", "V", "X"));
        num = num / 10;
        result.add(generate(num % 10, "X", "L", "C"));
        num = num / 10;
        result.add(generate(num % 10, "C", "D", "M"));
        num = num / 10;
        result.add(generate(num % 10, "M", " ", " "));

        Collections.reverse(result);

        return String.join("", result);
    }

    private String generate(int remainder, String one, String five, String ten) {
        switch (remainder) {
            case 0:
                return "";
            case 1:
                return one;
            case 2:
                return one + one;
            case 3:
                return one + one + one;
            case 4:
                return one + five;
            case 5:
                return five;
            case 6:
                return five + one;
            case 7:
                return five + one + one;
            case 8:
                return five + one + one + one;
            case 9:
                return one + ten;
            default:
                return "";
        }
    }
}
