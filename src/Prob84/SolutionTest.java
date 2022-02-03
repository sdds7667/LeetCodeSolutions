package Prob84;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    public static Stream<Arguments> leetCode() {
        return Stream.of(Arguments.of(new int[]{2, 1, 5, 6, 2, 3}, 10));
    }

    @ParameterizedTest
    @MethodSource("leetCode")
    void dc(int[] heights, int expected) {
        assertEquals(expected, new Solution().largestRectangleArea(heights));
    }
}