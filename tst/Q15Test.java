import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.junit.Assert.assertThat;

class Q15Test {
    private Q15 q15;

    @BeforeEach
    void setUp() {
        q15 = new Q15();
    }

    @ParameterizedTest
    @MethodSource("argsProvider")
    void tests(List<List<Integer>> expected, int[] input) {
        List<List<Integer>> output = q15.threeSum(input);
        assertThat(output, containsInAnyOrder(expected.toArray()));
    }

    static private Stream<Arguments> argsProvider() {
        return Stream.of(
                Arguments.of(Arrays.asList(), new int[]{}),
                Arguments.of(Arrays.asList(), new int[]{0,0}),
                Arguments.of(Arrays.asList(Arrays.asList(0,0,0)), new int[]{0,0,0}),
                Arguments.of(Arrays.asList(Arrays.asList(-4,-1,5)), new int[]{-1,-4,5}),
                Arguments.of(Arrays.asList(Arrays.asList(-1,0,1), Arrays.asList(-1,-1,2)), new int[]{-1,0,1,2,-1,-4}),
                Arguments.of(Arrays.asList(Arrays.asList(0,0,0)), new int[]{0,0,0,0,0,0}),
                Arguments.of(Arrays.asList(Arrays.asList(-4,-4,8), Arrays.asList(-4,2,2)), new int[]{2,2,2,2,-4,-4,8})
        );
    }
}