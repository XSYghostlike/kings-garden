import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

class Q12Test {
    private Q12 q12;

    @BeforeEach
    void setUp() {
        q12 = new Q12();
    }

    @ParameterizedTest
    @MethodSource("argsProvider")
    void tests(String expected, int input) {
        assertEquals(expected, q12.intToRoman(input));
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
