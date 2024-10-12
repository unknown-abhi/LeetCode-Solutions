/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {

        if (head == null || head.next == null) {
            return null;
        }

        ListNode mover = head;
        Map<ListNode, Integer> mp = new HashMap<>();

        while (mover != null && mover.next != null) {

            if (mp.getOrDefault(mover, 0) == 1) {
                return mover;
            }

            mp.put(mover, 1);
            mover = mover.next;
        }

        return null;
    }
}