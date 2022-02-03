package Prob25Reverse;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    public static Stream<Arguments> leetCode() {
        return Stream.of(Arguments.of(
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))),
                2
        ), Arguments.of(
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))),
                3
        ), Arguments.of(
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))),
                1
        ));
    }

    @ParameterizedTest
    @MethodSource("leetCode")
    @Timeout(100)
    void reverseKGroup(ListNode head, int k) {
        new Solution().reverseKGroup(head, k);
    }

}