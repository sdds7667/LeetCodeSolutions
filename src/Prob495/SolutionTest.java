package Prob495;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @ParameterizedTest
    @MethodSource("leetCodeSource")
    public void leetCode(int[] timeSeries, int duration, int expectation) {
        assertEquals(expectation, new Solution().findPoisonedDuration(timeSeries, duration));
    }

    public static Stream<Arguments> leetCodeSource() {
        return Stream.of(
                Arguments.of(new int[]{1, 4}, 2, 4),
                Arguments.of(new int[]{1, 2}, 2, 3)
        );
    }
}