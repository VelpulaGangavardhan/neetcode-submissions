
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {

        if (head == null || head.next == null) {
            return;
        }

        // Step 1: Find the middle of the list
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Split the list into two halves
        ListNode secondPart = slow.next;
        slow.next = null;

        // Step 3: Reverse the second half
        secondPart = reverseList(secondPart);

        // Step 4: Merge both halves alternately
        ListNode firstPart = head;

        while (secondPart != null) {
            ListNode firstNext = firstPart.next;
            ListNode secondNext = secondPart.next;

            firstPart.next = secondPart;
            secondPart.next = firstNext;

            firstPart = firstNext;
            secondPart = secondNext;
        }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            ListNode after = head.next;
            head.next = prev;
            prev = head;
            head = after;
        }

        return prev;
    }
}
