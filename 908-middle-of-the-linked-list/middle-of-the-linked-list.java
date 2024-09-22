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
    public ListNode middleNode(ListNode head) {
        int size = 0;
        ListNode tmp = head;

        while(tmp != null){
            size++;
            tmp = tmp.next;
        }

        int moveHead = size/2;

        while(moveHead > 0){
            head = head.next;
            moveHead--;
        }

        return head;
    }
}