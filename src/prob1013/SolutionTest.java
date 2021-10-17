package prob1013;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> lcs() {
        return Stream.of(
                Arguments.of(new int[]{0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1}, true),
                Arguments.of(new int[]{0, 2, 1, -6, 6, 7, 9, -1, 2, 0, 1}, false),
                Arguments.of(new int[]{3, 3, 6, 5, -2, 2, 5, 1, -9, 4}, true),
                Arguments.of(new int[]{1, -1, 1, -1}, false)
        );
    }

    @ParameterizedTest
    @MethodSource("lcs")
    public void lc(int[] arr, boolean expected) {
        assertEquals(expected, new Solution().canThreePartsEqualSum(arr));
    }

}