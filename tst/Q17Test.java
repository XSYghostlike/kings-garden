import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertTrue;

class Q17Test {
    private Q17 q17;

    @BeforeEach
    void setUp() {
        q17 = new Q17();
    }

    @ParameterizedTest
    @MethodSource("argsProvider")
    void tests(List<String> expected, String input) {
        List<String> output = q17.letterCombinations(input);
        assertTrue(expected.containsAll(output));
        assertTrue(output.containsAll(expected));
    }

    static private Stream<Arguments> argsProvider() {
        return Stream.of(
                Arguments.of(Arrays.asList(), ""),
                Arguments.of(Arrays.asList("a", "b", "c"), "2"),
                Arguments.of(Arrays.asList("p", "q", "r", "s"), "7"),
                Arguments.of(Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"), "23"),
                Arguments.of(Arrays.asList("ag", "ah", "ai", "bg", "bh", "bi", "cg", "ch", "ci"), "24"),
                Arguments.of(Arrays.asList(
                        "gpt", "gpu", "gpv", "gqt", "gqu", "gqv", "grt", "gru", "grv", "gst", "gsu", "gsv",
                        "hpt", "hpu", "hpv", "hqt", "hqu", "hqv", "hrt", "hru", "hrv", "hst", "hsu", "hsv",
                        "ipt", "ipu", "ipv", "iqt", "iqu", "iqv", "irt", "iru", "irv", "ist", "isv", "isu"
                        ), "478")

        );
    }
}