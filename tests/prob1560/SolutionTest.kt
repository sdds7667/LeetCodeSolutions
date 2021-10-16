package prob1560

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

internal class SolutionTest {
    @ParameterizedTest
    @MethodSource("lcs")
    fun lc(n: Int, input: IntArray, expected: List<Int>) {
        val result = Solution().mostVisited(n, input)
        assertEquals(expected.size, result.size, "Size diff")
        for (i in result.indices) {
            assertEquals(expected[i], result[i], "Element @ $i e[${expected[i]}] != r[${result[i]}]")
        }
    }

    companion object {
        @JvmStatic
        fun lcs(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(4, intArrayOf(1,3,1,2), listOf(1,2)),
                Arguments.of(2, intArrayOf(2,1,2,1,2,1,2,1,2), listOf(2)),
                Arguments.of(7, intArrayOf(1,3,5,7), listOf(1,2,3,4,5,6,7))
            )
        }
    }


}