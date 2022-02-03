/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

package Prob19;

import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                '}';
    }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fastPointer = head;

        // stop at the parent of nth node
        int k = n;
        while (k-- > 0) {
            fastPointer = fastPointer.next;
        }

        if (fastPointer == null) {
            head = head.next;
            return head;
        }
        ListNode slowPointer = head;
        while (fastPointer.next != null) {
            fastPointer = fastPointer.next;
            slowPointer = slowPointer.next;
        }

        slowPointer.next = slowPointer.next.next;
        return head;

    }
}