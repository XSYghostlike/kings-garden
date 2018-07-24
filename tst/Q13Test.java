import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

class Q13Test {
    private Q13 q13;

    @BeforeEach
    void setUp() {
        q13 = new Q13();
    }

    @ParameterizedTest
    @MethodSource("argsProvider")
    void tests(String input, int expected) {
        assertEquals(expected, q13.romanToInt(input));
    }

    static private Stream<Arguments> argsProvider() {
        return Stream.of(
                Arguments.of("", 0),
                Arguments.of("I", 1),
                Arguments.of("II", 2),
                Arguments.of("IV", 4),
                Arguments.of("V", 5),
                Arguments.of("IX", 9),
                Arguments.of("LVIII", 58),
                Arguments.of("MCMXCIV", 1994),
                Arguments.of("MMMCMXCIX", 3999)
        );
    }
}