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
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int idx = 1;
        ListNode curr = dummy;
        while(idx < left){
            curr = curr.next;
            idx++;
        }
        ListNode lft = curr, leftNext = curr.next;
        ListNode prev = null, currNode = curr.next, next;
        while(currNode != null && idx <= right){
            next = currNode.next;
            currNode.next = prev;
            prev = currNode;
            currNode = next;
            idx++;
        } 
        lft.next = prev;
        leftNext.next = currNode;
        return dummy.next;
    }
}