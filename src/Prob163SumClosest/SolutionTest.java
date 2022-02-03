package Prob163SumClosest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    public static Stream<Arguments> leetCode() {
        return Stream.of(Arguments.of(new int[]{-1, 2, 1, -4}, 1, 2),
                Arguments.of(new int[]{0, 0, 0}, 1, 0));
    }

    @ParameterizedTest
    @MethodSource("leetCode")
    void threeSumClosest(int[] nums, int target, int expected) {
        assertEquals(expected, new Solution().threeSumClosest(nums, target));
    }
}