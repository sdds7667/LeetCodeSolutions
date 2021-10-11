package Prob15;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void leetCodeExample1() {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        var result = new Solution().mergeTwoLists(l1, l2);
        assertEquals(result.val, 1);
        result = result.next;
        assertEquals(result.val, 1);
        result = result.next;
        assertEquals(result.val, 2);
        result = result.next;
        assertEquals(result.val, 3);
        result = result.next;
        assertEquals(result.val, 4);
        result = result.next;
        assertEquals(result.val, 4);
        result = result.next;
        assertNull(result);
    }

    @Test
    public void     testEmptyLists() {
        ListNode l1 = null;
        ListNode l2 = null;

        ListNode sol = new Solution().mergeTwoLists(l1, l2);

        assertNull(sol);
    }
}