package Prob830;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @ParameterizedTest
    @MethodSource("leetCodeSource")
    public void leetCode(String input, List<List<Integer>> expected) {
        var res = new Solution().largeGroupPositions(input);
        assertEquals( expected.size(), res.size());
        for (int i = 0; i < res.size(); i++) {
            assertEquals(expected.get(i).size(), res.get(i).size());
            for (int j = 0; j < res.get(i).size(); j++) {
                assertEquals(expected.get(i).get(j), res.get(i).get(j));
            }
        }
    }

    public static Stream<Arguments> leetCodeSource() {
        return Stream.of(
                Arguments.of("abbxxxxzzy", List.of(List.of(3, 6))),
                Arguments.of("abc", List.of()),
                Arguments.of("abcdddeeeeaabbbcd", List.of(List.of(3, 5), List.of(6, 9), List.of(12, 14))),
                Arguments.of("abbb", List.of(List.of(1, 3)))
        );
    }

}