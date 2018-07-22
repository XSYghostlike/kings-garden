import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class Q6Test {
    private Q6 q6;

    @BeforeEach
    void setUp() {
        q6 = new Q6();
    }

    @Test
    void tests() {
        assertEquals("PINALSIGYAHRPI", q6.convert("PAYPALISHIRING", 4));
        assertEquals("PAHNAPLSIIGYIR", q6.convert("PAYPALISHIRING", 3));
        assertEquals("ABCDEFG", q6.convert("ABCDEFG", 1));
        assertEquals("", q6.convert("", 2));
    }
}