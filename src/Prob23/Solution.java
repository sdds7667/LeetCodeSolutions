package Prob23;


import java.util.Comparator;
import java.util.PriorityQueue;


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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> nodes = new PriorityQueue<>(Comparator.comparingInt(node -> node.val));
        for (ListNode list : lists) {
            if (list != null) {
                nodes.add(list);
            }
        }
        if (nodes.isEmpty()) return null;
        ListNode head = nodes.poll();
        ListNode currentNode = head;
        if (head.next != null) {
            nodes.add(head.next);
        }
        while (!nodes.isEmpty()) {
            var smallestNode = nodes.poll();
            if (smallestNode.next != null) nodes.add(smallestNode.next);
            currentNode.next = smallestNode;
            currentNode = smallestNode;
        }
        return head;
    }

}