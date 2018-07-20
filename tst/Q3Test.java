import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class Q3Test {

    private Q3 q3;

    @BeforeEach
    void setUp() {
        q3 = new Q3();
    }

    @Test
    void tests() {
        assertEquals(3, q3.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, q3.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, q3.lengthOfLongestSubstring("pwwkew"));
        assertEquals(0, q3.lengthOfLongestSubstring(""));
        assertEquals(6, q3.lengthOfLongestSubstring("abcdef"));
    }
}
