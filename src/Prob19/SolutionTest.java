package Prob19;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void removeNthFromEnd() {
        ListNode l2 = new ListNode(2, null);
        ListNode l1 = new ListNode(1, l2);
        assertEquals(l1, new Solution().removeNthFromEnd(l1, 1));
    }

    @Test
    void removeOnlyOne() {
        ListNode l1 = new ListNode(1, null);
        assertNull(new Solution().removeNthFromEnd(l1, 1));
    }

    @Test
    void removeHead() {
        ListNode l2 = new ListNode(2, null);
        ListNode l1 = new ListNode(1, l2);
        assertEquals(l2, new Solution().removeNthFromEnd(l1, 2));
    }

    @Test
    void removeSecond() {
        ListNode l5 = new ListNode(5, null);
        ListNode l4 = new ListNode(4, l5);
        ListNode l3 = new ListNode(3, l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);

        ListNode newHead = new Solution().removeNthFromEnd(l1, 2);

        assertEquals(newHead.val, 1);
        assertEquals((newHead = newHead.next).val, 2);
        assertEquals((newHead = newHead.next).val, 3);
        assertEquals((newHead = newHead.next).val, 5);
    }
}