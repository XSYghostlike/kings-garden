import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

class Q9Test {
    private Q9 q9;

    @BeforeEach
    void setUp() {
        q9 = new Q9();
    }

    @ParameterizedTest
    @ValueSource(ints = {121, 0, -0, 1})
    void positiveTests(int x) {
        assertTrue(q9.isPalindrome(x));
    }

    @ParameterizedTest
    @ValueSource(ints = {-121, 10})
    void negativeTests(int x) {
        assertFalse(q9.isPalindrome(x));
    }
}
