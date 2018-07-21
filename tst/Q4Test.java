import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class Q4Test {
    private Q4 q4;

    @BeforeEach
    void setUp() {
        q4 = new Q4();
    }

    @Test
    void tests() {
        assertEquals(1, q4.findMedianSortedArrays(new int[]{}, new int[]{1}), 1e-10);
        assertEquals(2.5, q4.findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}), 1e-10);
        assertEquals(3, q4.findMedianSortedArrays(new int[]{1,2}, new int[]{3,4,5}), 1e-10);
        assertEquals(2, q4.findMedianSortedArrays(new int[]{1,2,3}, new int[]{}), 1e-10);
    }
}
