package Prob500;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @ParameterizedTest
    @MethodSource("leetCodeSource")
    public void leetCode(String[] input, String[] result) {
        assertArrayEquals(new Solution().findWords(input), result);
    }

    public static Stream<Arguments> leetCodeSource() {
        return Stream.of(
                Arguments.of(new String[]{"Hello", "Alaska", "Dad", "Peace"}, new String[]{"Alaska", "Dad"}),
                Arguments.of(new String[]{"omk"}, new String[]{}),
                Arguments.of(new String[]{"adsdf", "sfd"}, new String[]{"adsdf", "sfd"})
        );
    }
}