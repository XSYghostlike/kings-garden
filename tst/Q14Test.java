import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

class Q14Test {
    private Q14 q14;

    @BeforeEach
    void setUp() {
        q14 = new Q14();
    }

    @ParameterizedTest
    @MethodSource("argsProvider")
    void tests(String expected, String[] input) {
        assertEquals(expected, q14.longestCommonPrefix(input));
    }

    static private Stream<Arguments> argsProvider() {
        return Stream.of(
                Arguments.of("", new String[]{}),
                Arguments.of("", new String[]{""}),
                Arguments.of("a", new String[]{"a"}),
                Arguments.of("a", new String[]{"a","a"}),
                Arguments.of("", new String[]{"a","b"}),
                Arguments.of("fl", new String[]{"flower","flow","flight"}),
                Arguments.of("", new String[]{"dog","race","car"}),
                Arguments.of("ab", new String[]{"abc","abccb","ab"})
        );
    }
}