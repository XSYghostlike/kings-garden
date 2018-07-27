// 13. Roman to Integer

class Q13 {
    // input 1 - 3999.
    public int romanToInt(String s) {
        int result = 0;
        int index = 0;
        int temp, digit;

        String[] board = {"I","V","X","L","C","D","M"," "," "};

        while (!s.equals("")) {
            temp = generate(s, board[index*2], board[index*2+1], board[index*2+2]);
            digit = temp % 10;
            s = s.substring(0, s.length() - temp / 10);
            result = result + digit * (int)Math.pow(10, index);
            index++;
        }

        return result;
    }

    private int generate(String s, String one, String five, String ten) {
        String str = s.substring(Math.max(s.length()-4, 0));
        if (str.contains(five + one + one + one)) return 48;
        if (str.contains(five + one + one)) return 37;
        if (str.contains(five + one)) return 26;
        if (str.contains(one + five)) return 24;
        if (str.contains(five)) return 15;
        if (str.contains(one + one + one)) return 33;
        if (str.contains(one + one)) return 22;
        if (str.contains(one + ten)) return 29;
        if (str.contains(one)) return 11;
        return 0;
    }
}
