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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummyHead = new ListNode(0); // Create a dummy head to simplify logic
        ListNode current = dummyHead;
        int carry = 0; // To handle carries during addition

        // Traverse both lists
        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0; // Get value from l1 or 0 if l1 is null
            int y = (l2 != null) ? l2.val : 0; // Get value from l2 or 0 if l2 is null

            int sum = x + y + carry; // Add values and carry
            carry = sum / 10; // Compute carry for the next iteration
            current.next = new ListNode(sum % 10); // Create new node with the sum mod 10
            current = current.next; // Move to the next node

            // Move to the next nodes in l1 and l2
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }

        // If carry is left after the last addition, create a new node for it
        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        return dummyHead.next; // Return the actual head (next of dummy node)
    }
}