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
    public ListNode reverseLL(ListNode head){

        if(head.next == null){
            return head;
        }

        ListNode newHead = reverseLL(head.next);

        ListNode front = head.next;
        front.next = head;
        head.next = null; 

        return newHead;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode reverseHead = reverseLL(slow);

        while(reverseHead != null){
            if(head.val != reverseHead.val){
               return false; 
            }

            head = head.next;
            reverseHead = reverseHead.next;
        }

        return true;
    }
}