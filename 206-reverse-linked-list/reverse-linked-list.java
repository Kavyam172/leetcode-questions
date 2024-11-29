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
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return head;
        }

        ListNode front = head.next;
        ListNode curr = head;
        ListNode prev = null;
        while(curr!=null){
            curr.next = prev;
            prev = curr;
            curr = front;
            if(front!=null){
                front = front.next;
            }
        }
        return prev;

    }
}