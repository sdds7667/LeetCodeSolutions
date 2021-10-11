package Prob1534;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Prob1534SolutionTest {

    @ParameterizedTest
    @MethodSource("leetCodeSource")
    public void leetCode(int[] arr, int a, int b, int c, int expected) {
        var result = new Solution().countGoodTriplets(arr, a, b, c);
        assertEquals(expected, result);
    }

    public static Stream<Arguments> leetCodeSource() {
        return Stream.of(
                Arguments.of(new int[]{3, 0, 1, 1, 9, 7}, 7, 2, 3, 4),
                Arguments.of(new int[]{1, 1, 2, 2, 3}, 0, 0, 1, 0),
                Arguments.of(new int[]{7, 3, 7, 3, 12, 1, 12, 2, 3}, 5, 8, 1, 12)
        );
    }

    @ParameterizedTest
    @MethodSource("cbsSource")
    public void customBinarySearch(int[] arr, int start, int key, int expected) {
        assertEquals(expected, Solution.customBinarySearch(arr, start, key));
    }

    public static Stream<Arguments> cbsSource() {
        return Stream.of(
                Arguments.of(new int[]{0, 1, 2, 3, 4}, 0, 2, 2),
                Arguments.of(new int[]{0, 7, 14, 15, 16}, 0, 6, 1),
                Arguments.of(new int[]{0, 2, 4, 6, 6, 6, 8, 10}, 5, 4, 5)
        );
    }
}