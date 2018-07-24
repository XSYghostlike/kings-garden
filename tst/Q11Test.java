import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

class Q11Test {
    private Q11 q11;

    @BeforeEach
    void setUp() {
        q11 = new Q11();
    }

    @ParameterizedTest
    @MethodSource("argsProvider")
    void tests(int expected, int[] input) {
        assertEquals(expected, q11.maxArea(input));
    }

    static private Stream<Arguments> argsProvider() {
        return Stream.of(
                Arguments.of(49, new int[]{1,8,6,2,5,4,8,3,7}),
                Arguments.of(0, new int[]{}),
                Arguments.of(0, new int[]{8}),
                Arguments.of(3, new int[]{3,7}),
                Arguments.of(14, new int[]{7,7,7}),
                Arguments.of(56, new int[]{1,8,6,2,5,4,8,3,9}),
                Arguments.of(49, new int[]{1,10,6,2,5,4,8,3,7})
        );
    }
}
