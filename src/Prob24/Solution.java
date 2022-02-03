package Prob24;

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
}

class Solution {
    public ListNode swapPairs(ListNode head) {

        // special case list.length = 1
        if (head == null) return null;
        if (head.next == null) return head;
        var newHead = head.next;
        head.next = newHead.next;
        newHead.next = head;

        var currentNode = head;
        while(currentNode.next != null && currentNode.next.next != null) {
            var current_plus_1 = currentNode.next;
            var current_plus_2 = currentNode.next.next;
            var current_plus_3 = currentNode.next.next.next;

            currentNode.next = current_plus_2;
            current_plus_2.next = current_plus_1;
            current_plus_1.next = current_plus_3;
            currentNode = current_plus_1;
        }

        return newHead;

    }
}