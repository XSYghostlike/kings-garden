import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class Q5Test {
    private Q5 q5;

    @BeforeEach
    void setUp() {
        q5 = new Q5();
    }

    @Test
    void tests() {
        assertEquals("", q5.longestPalindrome(""));
        assertEquals("a", q5.longestPalindrome("a"));
        assertEquals("bb", q5.longestPalindrome("bbc"));
        assertEquals("bb", q5.longestPalindrome("cbb"));
        assertEquals("a", q5.longestPalindrome("abc"));
        assertEquals("abcba", q5.longestPalindrome("rrabcba"));
        assertEquals("cbabc", q5.longestPalindrome("abcbabc"));
    }
}
