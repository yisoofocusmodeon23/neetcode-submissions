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
    public ListNode middleOfList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode fast = head.next, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode reverse(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode prev = null, curr = head, next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }
        ListNode mid = middleOfList(head);
        ListNode secondHalf = mid.next;
        mid.next = null;
        ListNode reversed = reverse(secondHalf);
        ListNode curr1 = head, curr2 = reversed, next, next2;
        while (curr2 != null) {
            next = curr1.next;
            next2 = curr2.next;
            curr1.next = curr2;
            curr2.next = next;
            curr1 = next;
            curr2 = next2;
        }
    }
}
