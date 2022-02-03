package Prob25Reverse;

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
    public ListNode reverseKGroup(ListNode head, int k) {

        if (k == 1) return head;
        ListNode newRoot = new ListNode(0, head);

        ListNode fastPointer = newRoot;
        ListNode root = newRoot;
        var c = k;
        do {
            while (fastPointer != null && c-- > 0) {
                fastPointer = fastPointer.next;
            }
            if (fastPointer == null) break;
            var cn = root.next;
            var nn = cn.next;
            root.next = fastPointer;
            root = cn;
            fastPointer = fastPointer.next;
            c = k-1;

            // reverse the current list
            var pn = fastPointer;
            for (int i = 0; i < k; i++) {
                cn.next = pn;
                pn = cn;
                cn = nn;
                nn = nn.next;
            }
        } while (true);

        return newRoot.next;
    }
}