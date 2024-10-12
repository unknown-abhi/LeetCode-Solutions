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
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode flag = head;

        int count = 0;

        while (fast != null && fast.next != null) {
            if (count >= 1) {
                flag = flag.next;
            }
            slow = slow.next;
            fast = fast.next.next;
            count++;
        }

        if (slow.next == null) {
            flag.next = null;
        } else {
            flag.next = slow.next;
            slow.next = null;
        }

        return head;
    }
}