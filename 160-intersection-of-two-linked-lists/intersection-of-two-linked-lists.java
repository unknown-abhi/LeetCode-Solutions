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

        ListNode tmpA = headA;
        ListNode tmpB = headB;
        HashMap<ListNode, Integer> freqMap = new HashMap<>();

        while (tmpA != null) {
            freqMap.put(tmpA, 1);
            tmpA = tmpA.next;
        }

        while (tmpB != null) {
            if(freqMap.getOrDefault(tmpB, 0) == 1){
                return tmpB;
            }

            tmpB = tmpB.next;
        }

        return null;
    }
}