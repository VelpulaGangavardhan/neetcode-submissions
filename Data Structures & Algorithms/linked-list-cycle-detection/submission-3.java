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
    public boolean hasCycle(ListNode head) {
        if(head ==null || head.next == null){
            return false;
        }
        ListNode slow = head.next;
        ListNode fast = head.next.next;

        while(slow.next != null){
         
            if(fast.next == null || fast.next.next == null){
                fast = head;
            }
            if(slow.val == fast.val){
                return true;
            }
            fast = fast.next.next;
            slow = slow.next;
           

        }
        return false;
    }
}
