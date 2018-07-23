// 10. Regular Expression Matching

class Q10 {
    public boolean isMatch(String s, String p) {
        boolean[][] board = new boolean[s.length()+1][p.length()+1];
        int i, j;

        for (i=s.length();i>=0;i--) {
            board[i][p.length()] = i == s.length();
        }

        for (j=p.length()-1;j>=0;j--) {
            if (j < p.length()-1 && p.charAt(j+1) == '*') {
                board[s.length()][j] = board[s.length()][j+2];
            } else {
                board[s.length()][j] = false;
            }
        }

        for (i=s.length()-1;i>=0;i--) {
            for (j=p.length()-1;j>=0;j--) {
                if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.') {
                    if ((j < p.length()-1 && p.charAt(j+1) != '*') || j == p.length()-1) {
                        board[i][j] = board[i+1][j+1];
                    } else {
                        board[i][j] = board[i+1][j+2] || board[i+1][j] || board[i][j+2];
                    }
                } else {
                    if (j < p.length()-1 && p.charAt(j+1) == '*') {
                        board[i][j] = board[i][j+2];
                    } else {
                        board[i][j] = false;
                    }
                }
            }
        }

        return board[0][0];
    }


    // Update: TimeLimitExceeded, Use Dynamic Programming instead.
    // public boolean isMatch(String s, String p) {
    //     if (p.length() == 0) {
    //         return s.length() == 0;
    //     }
    //
    //     if (s.length() == 0) {
    //         if (p.length() > 1 && p.charAt(1) == '*') {
    //             return isMatch(s, p.substring(2));
    //         } else {
    //             return false;
    //         }
    //     }
    //
    //     if (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.') {
    //         if ((p.length() > 1 && p.charAt(1) != '*') || p.length() == 1) {
    //             return isMatch(s.substring(1), p.substring(1));
    //         } else {
    //             return isMatch(s.substring(1), p.substring(2)) || isMatch(s.substring(1), p) || isMatch(s, p.substring(2));
    //         }
    //     } else {
    //         if (p.length() > 1 && p.charAt(1) == '*') {
    //             return isMatch(s, p.substring(2));
    //         } else {
    //             return false;
    //         }
    //     }
    // }
}
