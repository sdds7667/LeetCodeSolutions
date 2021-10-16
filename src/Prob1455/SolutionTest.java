package Prob1455;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("leetCodeSource")
    public void leetcode(String sentence, String searchPrefix, int expected) {
        assertEquals(expected, new Solution().isPrefixOfWord(sentence, searchPrefix));
    }

    public static Stream<Arguments> leetCodeSource() {
        return Stream.of(
                Arguments.of("i love eating burger","burg", 4),
                Arguments.of("this problem is an easy problem", "pro", 2),
                Arguments.of("i am tired", "you", -1),
                Arguments.of("i use triple used", "used", 4),
                Arguments.of("hello from the other side", "they", -1)
        );

    }

}