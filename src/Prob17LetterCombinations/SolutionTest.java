package Prob17LetterCombinations;

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
                Arguments.of("23", List.of(
                        "ad","ae","af","bd","be","bf","cd","ce","cf"
                )),
                Arguments.of("", List.of()),
                Arguments.of("2", List.of("a", "b", "c"))
        );
    }

    @ParameterizedTest
    @MethodSource("leetCode")
    void letterCombinations(String x, List<String> expected) {
        assertEquals(expected, new Solution().letterCombinations(x));
    }
}