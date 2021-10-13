package Prob709;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @ParameterizedTest
    @MethodSource("leetCodeSource")
    public void leetCode(String input, String solution) {
        assertEquals(solution, new Solution().toLowerCase(input));
    }

    public static Stream<Arguments> leetCodeSource() {
        return Stream.of(Arguments.of("Here", "here"),
                Arguments.of("here", "here"),
                Arguments.of("LOVELY", "lovely")
        );
    }


}