/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
           // Edge case: if no reversal needed
        if (head == null || left == right) return head;

        // Dummy node to simplify edge cases (like reversing from head)
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Step 1: Move `prev` to the node before `left`
        ListNode prev = dummy;
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        // Step 2: Reverse sublist from left to right
        ListNode curr = prev.next;
        ListNode next = null;
        ListNode tail = curr; // tail will be the end of reversed sublist

        for (int i = left; i <= right; i++) {
            next = curr.next;
            curr.next = prev.next;
            prev.next = curr;
            curr = next;
        }

        // Step 3: Connect tail to the remaining list
        tail.next = curr;

        return dummy.next;

    }
}