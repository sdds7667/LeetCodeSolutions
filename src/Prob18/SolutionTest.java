package Prob18;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    public static Stream<Arguments> leetCode() {
        return Stream.of(
                Arguments.of(new int[]{1,-2,-5,-4,-3,3,3,5}, -11, List.of(List.of(-5,-4,-3,1)))
        );
    }

    @ParameterizedTest
    @MethodSource("leetCode")
    void fourSum(int[] a, int b, List<List<Integer>> expected) {
        assertEquals(expected, new Solution().fourSum(a, b));
    }
}