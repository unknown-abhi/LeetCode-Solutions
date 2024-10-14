/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) {
            return null;
        }

        ListNode tmpA = headA;
        ListNode tmpB = headB;

        while (tmpA != tmpB) {

            tmpA = tmpA.next;
            tmpB = tmpB.next;

            if (tmpA == tmpB) {
                return tmpA;
            }

            if (tmpA == null) {
                tmpA = headB;
            }

            if (tmpB == null) {
                tmpB = headA;
            }
        }

        return tmpA;
    }
}