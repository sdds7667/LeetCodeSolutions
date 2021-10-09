package Prob1021;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @ParameterizedTest
    @MethodSource("leetCodeSource")
    public void leetCodeTests(String s, String expected) {
        assertEquals(expected, new Solution().removeOuterParentheses(s));
    }

    public static Stream<Arguments> leetCodeSource() {
        return Stream.of(
                Arguments.of("(()())(())", "()()()"),
                Arguments.of("(()())(())(()(()))", "()()()()(())"),
                Arguments.of("()()", "")
        );
    }
}