package Prob10;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @ParameterizedTest
    @MethodSource("leetCodeTests")
    public void test(String s, String p, boolean expected) {
        assertEquals(expected, new Solution().isMatch(s, p));
    }

    public static Stream<Arguments> leetCodeTests() {
        return Stream.of(Arguments.of("a", "aa", false),
                Arguments.of("aa", "a*", true),
                Arguments.of("ab", ".*", true));
    }

    @ParameterizedTest
    @MethodSource("custom")
    public void testCustom(String s, String p, boolean expected) {
        assertEquals(expected, new Solution().isMatch(s, p));
    }

    public static Stream<Arguments> custom() {
        return Stream.of(
                Arguments.of("", ".*a*k*", true),
                Arguments.of("asdfjljvlnzxckvsIONasdvjzxckvlksadjv", ".*ION.*", true),
                Arguments.of("asdfjljvlnzxckvsIONasdvjzxIONckvlksadjv", ".*ION.*", true),
                Arguments.of("asdfjljvlnzxckvsINasdvjzxckvlksadjv", ".*ION.*", false),
                Arguments.of("asdfjljvlnzxckvsONasdvjzxckvlksadjv", ".*ION.*", false),
                Arguments.of("asdfjljvlnzxckvsIOasdvjzxckvlksadjv", ".*ION.*", false)
                );
    }
}