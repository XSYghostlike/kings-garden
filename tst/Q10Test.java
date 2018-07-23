import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

class Q10Test {
    private Q10 q10;

    @BeforeEach
    void setUp() {
        q10 = new Q10();
    }

    @Test
    void tests() {
        assertTrue(q10.isMatch("", ""));
        assertTrue(q10.isMatch("", "p*"));
        assertTrue(q10.isMatch("", ".*"));
        assertFalse(q10.isMatch("", "."));
        assertFalse(q10.isMatch("aa", "a"));
        assertTrue(q10.isMatch("aa", "a*"));
        assertTrue(q10.isMatch("ab", ".*"));
        assertTrue(q10.isMatch("aab", "c*a*b"));
        assertFalse(q10.isMatch("mississippi", "mis*is*p*."));
        assertFalse(q10.isMatch("aaaaaaaaaaaaab", "a*a*a*a*a*a*a*a*a*a*c"));
    }
}