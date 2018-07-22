import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class Q7Test {
    private Q7 q7;

    @BeforeEach
    void setUp() {
        q7 = new Q7();
    }

    @Test
    void tests() {
        assertEquals(-1, q7.reverse(-1));
        assertEquals(0, q7.reverse(0));
        assertEquals(-141321, q7.reverse(-123141));
        assertEquals(141321, q7.reverse(123141));
        assertEquals(0, q7.reverse((Integer.MAX_VALUE / 10 - 1) * 10 + 9));
        assertEquals(0, q7.reverse((Integer.MIN_VALUE / 10 + 1) * 10 - 9));
    }
}
