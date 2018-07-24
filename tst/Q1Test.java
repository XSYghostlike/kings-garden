import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

class Q1Test {

    private Q1 q1;

    @BeforeEach
    void setUp() {
        q1 = new Q1();
    }

    @ParameterizedTest
    @MethodSource("argsProvider")
    void tests(int[] expected, int[] arr, int target) {
        assertArrayEquals(expected, q1.twoSum(arr, target));
    }

    static private Stream<Arguments> argsProvider() {
        return Stream.of(
                Arguments.of(new int[]{2,4}, new int[]{3,4,5,6,7}, 12),
                Arguments.of(new int[]{3,4}, new int[]{3,4,5,6,7}, 13),
                Arguments.of(new int[]{0,1}, new int[]{3,4,5,6,7}, 7),
                Arguments.of(new int[]{0,1}, new int[]{3,3,4}, 6)
        );
    }
}
