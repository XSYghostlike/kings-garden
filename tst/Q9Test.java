import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

class Q9Test {
    private Q9 q9;

    @BeforeEach
    void setUp() {
        q9 = new Q9();
    }

    @Test
    void tests() {
        assertTrue(q9.isPalindrome(121));
        assertFalse( q9.isPalindrome(-121));
        assertTrue(q9.isPalindrome(0));
        assertTrue(q9.isPalindrome(-0));
        assertTrue(q9.isPalindrome(1));
        assertFalse(q9.isPalindrome(10));
    }
}
