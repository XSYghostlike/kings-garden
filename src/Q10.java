// 10. Regular Expression Matching
// TODO: TimeLimitExceeded, Use Dynamic Programming instead.

class Q10 {
    public boolean isMatch(String s, String p) {
        if (p.length() == 0) {
            return s.length() == 0;
        }

        if (s.length() == 0) {
            if (p.length() > 1 && p.charAt(1) == '*') {
                return isMatch(s, p.substring(2));
            } else {
                return false;
            }
        }

        if (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.') {
            if ((p.length() > 1 && p.charAt(1) != '*') || p.length() == 1) {
                return isMatch(s.substring(1), p.substring(1));
            } else {
                return isMatch(s.substring(1), p.substring(2)) || isMatch(s.substring(1), p) || isMatch(s, p.substring(2));
            }
        } else {
            if (p.length() > 1 && p.charAt(1) == '*') {
                return isMatch(s, p.substring(2));
            } else {
                return false;
            }
        }
    }
}
