import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

class Q16Test {
    private Q16 q16;

    @BeforeEach
    void setUp() {
        q16 = new Q16();
    }

    @ParameterizedTest
    @MethodSource("argsProvider")
    void tests(int expected, int[] input, int target) {
        int output = q16.threeSumClosest(input, target);
        assertEquals(expected, output);
    }

    static private Stream<Arguments> argsProvider() {
        return Stream.of(
                Arguments.of(0, new int[]{0,0,0}, 0),
                Arguments.of(2, new int[]{-1,1,2,-4}, 1),
                Arguments.of(3, new int[]{1,1,2,1}, 3),
                Arguments.of(6, new int[]{1,2,4,0}, 6),
                Arguments.of(-147, new int[]{-100,3,-101,-50}, 1)
        );
    }
}