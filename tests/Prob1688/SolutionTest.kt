package Prob1688

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

internal class SolutionTest {
    @ParameterizedTest
    @MethodSource("leetCodeSource")
    fun leetCode(input: String, word: String, expected: Int){
        assertEquals(expected, Solution().maxRepeating(input, word));
    }

    companion object {
        @JvmStatic
        fun leetCodeSource(): Stream<Arguments> {
            return Stream.of(
                Arguments.of("ababc", "ab", 2),
                Arguments.of("ababc", "ba", 1),
                Arguments.of("ababc", "ac", 0),
                Arguments.of("ab", "ab", 1),
                Arguments.of("aaabaaaabaaabaaaabaaaabaaaabaaaaba", "aaaba", 5)
            )
        }
    }


}