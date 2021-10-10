package Prob1971;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("leetCodeSource")
    public void leetCode(int n, int[][] edges, int start, int end, boolean expected) {
        assertEquals(expected, new Solution().validPath(n, edges, start, end));
    }

    public static Stream<Arguments> leetCodeSource() {
        return Stream.of(
                Arguments.of(3, new int[][]{{0, 1}, {1, 2}, {2, 0}}, 0, 2, true),
                Arguments.of(6, new int[][]{{0, 1}, {0, 2}, {3, 5}, {5, 4}, {4, 3}}, 0, 5, false),
                Arguments.of(10, new int[][]{{0,7},{0,8},{6,1},{2,0},{0,4},{5,8},{4,7},{1,3},{3,5},{6,5}}, 7, 5, true)
        );
    }

    @ParameterizedTest
    @MethodSource("binSearchSource")
    public void testBinSearch(int[][] edgeList, int key, int expected) {
        assertEquals(expected, new Solution().binSearch(edgeList,key));
    }

    public static Stream<Arguments> binSearchSource() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 2}, {1, 3}, {2, 4}, {2, 5}, {2, 6}, {3, 3}, {5, 7}}, 2, 2),
                Arguments.of(new int[][]{{1, 2}, {1, 3}, {2, 4}, {4, 5}, {11, 6}, {15, 3}, {23, 7}}, 23, 6),
                Arguments.of(new int[][]{{1, 2}, {1, 3}, {2, 4}, {2, 5}, {2, 6}, {3, 3}, {5, 7}}, 3, 5),
                Arguments.of(new int[][]{{1, 2}, {1, 3}, {2, 4}, {2, 5}, {2, 6}, {3, 3}, {5, 7}}, 1, 0)
        );
    }

}