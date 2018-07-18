import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class Q1Test {

    private Q1 q1;

    @BeforeEach
    void setUp() {
        q1 = new Q1();
    }

    @Test
    void tests() {
        assertArrayEquals(new int[]{2,4}, q1.twoSum(new int[]{3,4,5,6,7}, 12));
        assertArrayEquals(new int[]{3,4}, q1.twoSum(new int[]{3,4,5,6,7}, 13));
        assertArrayEquals(new int[]{0,1}, q1.twoSum(new int[]{3,4,5,6,7}, 7));
    }
}
