package Prob1791;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @ParameterizedTest
    @MethodSource("leetCodeSource")
    public void leetCode(int[][] arr, int expected) {
        assertEquals(expected, new Solution().findCenter(arr));
    }

    public static Stream<Arguments> leetCodeSource() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 2}, {2, 3}, {4, 2}}, 2),
                Arguments.of(new int[][]{{1, 2}, {5, 1}, {1, 3}, {1, 4}}, 1)
        );
    }


}
