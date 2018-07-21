// 5. Longest Palindromic Substring

public class Q5 {
    public String longestPalindrome(String s) {
        if (s.length() == 0) return "";

        // Starting index of the current Longest Palindromic Substring
        int I_max = 0;
        // Ending index of ...
        int J_max = 0;
        // Length of ...
        int L_max = 1;

        // Board index;
        int i,j;

        int[][] board = new int[s.length()][s.length()];

        for (i=0;i<s.length();i++) {
            board[i][i] = 1;
            if (i < s.length() - 1 && s.charAt(i) == s.charAt(i+1)) {
                board[i][i+1] = 2;
                if (2 > L_max) {
                    I_max = i;
                    J_max = i + 1;
                    L_max = 2;
                }
            }
        }

        for (i=s.length()-3;i>=0;i--) {
            for (j=s.length()-1;j>i+1;j--) {
                board[i][j] = s.charAt(i) == s.charAt(j) && board[i+1][j-1] != 0 ? board[i+1][j-1] + 2 : 0;
                if (board[i][j] > L_max) {
                    I_max = i;
                    J_max = j;
                    L_max = board[i][j];
                }
            }
        }

        return s.substring(I_max, J_max+1);
    }
}
