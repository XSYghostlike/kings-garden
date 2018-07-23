// 8. String to Integer (atoi)

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Q8 {
    public int myAtoi(String str) {
        Pattern pattern = Pattern.compile("\\S");
        Matcher matcher = pattern.matcher(str);
        int position, sign;
        long num;
        if (matcher.find()) {
            position = matcher.start();
            char head = str.charAt(position);
            if (head == '-') {
                num = 0;
                sign = -1;
            } else
            if (head == '+') {
                num = 0;
                sign = 1;
            } else
            if (head <= '9' && head >= '0') {
                num = head - '0';
                sign = 1;
            } else {
                return 0;
            }
        } else {
            return 0;
        }

        position++;
        num = num * sign;

        while (position < str.length() && str.charAt(position) <= '9' && str.charAt(position) >= '0') {
            num = num * 10 + sign * (str.charAt(position) - '0');
            position++;
            if (num > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            if (num < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }

        return (int)num;
    }
}
