package prob1047;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> lcs() {
        return Stream.of(
                Arguments.of("abbaca", "ca"),
                Arguments.of("azxxzy", "ay")
        );
    }

    @ParameterizedTest
    @MethodSource("lcs")
    public void lc(String input, String expected) {
        assertEquals(expected, new Solution().removeDuplicates(input));
    }

}