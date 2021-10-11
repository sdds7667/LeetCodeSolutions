package Prob88;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @ParameterizedTest
    @MethodSource("leetCodeSource")
    public void leetCode(int[] nums1, int m, int[] nums2, int n, int[] expected) {
        new Solution().merge(nums1, m, nums2, n);
        assertArrayEquals(nums1, expected);
    }

    public static Stream<Arguments> leetCodeSource() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3, new int[]{1, 2, 2, 3, 5, 6}),
                Arguments.of(new int[]{1}, 1, new int[]{}, 0, new int[]{1}),
                Arguments.of(new int[]{0}, 0, new int[]{1}, 1, new int[]{1}),
                Arguments.of(new int[]{4, 0, 0, 0, 0, 0}, 1, new int[]{1, 2, 3, 5, 6}, 5, new int[]{1, 2, 3, 4, 5, 6})
        );
    }
}