import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class Q8Test {
    private Q8 q8;

    @BeforeEach
    void setUp() {
        q8 = new Q8();
    }

    @Test
    void tests() {
        assertEquals(42, q8.myAtoi("42"));
        assertEquals(0, q8.myAtoi("test 42"));
        assertEquals(-42, q8.myAtoi("   \n \t-42 test"));
        assertEquals(-42, q8.myAtoi("   \n \t-42test"));
        assertEquals(-42, q8.myAtoi("   \n \t-042 test"));
        assertEquals(42, q8.myAtoi("   \n \t+042 test"));
        assertEquals(0, q8.myAtoi("   \n \t-0 test"));
        assertEquals(Integer.MIN_VALUE, q8.myAtoi("   \n \t-9999999999999 test"));
        assertEquals(Integer.MAX_VALUE, q8.myAtoi("   \n \t9999999999999 test"));
    }
}