// 9. Palindrome Number

class Q9 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int temp = x;

        long mirror = 0;
        while (temp > 0) {
            mirror = mirror * 10 + temp % 10;
            temp = temp / 10;
        }

        return mirror == x;
    }
}
