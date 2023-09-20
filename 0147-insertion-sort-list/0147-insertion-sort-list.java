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
    public ListNode insertionSortList(ListNode head) {
        ListNode curr = head.next;
        ListNode h = head; 
        h.next = null;
        while (curr != null) {
            ListNode temp = curr;
            curr = curr.next;
            ListNode px = null;
            ListNode x = h;
            while (x != null && x.val < temp.val) {
                px = x;
                x = x.next;
            }
            if (px != null) 
                px.next = temp;
            else 
                h = temp;
            temp.next = x;
        }
        return h;
    }
}