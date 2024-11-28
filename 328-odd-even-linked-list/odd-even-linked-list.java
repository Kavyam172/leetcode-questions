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
    public ListNode oddEvenList(ListNode head) {
        if(head==null){
            return head;
        }

        ListNode evenHead = new ListNode(0);
        ListNode oddHead = new ListNode(0);
        ListNode even = evenHead;
        ListNode odd = oddHead;
        ListNode temp = head;
        int i=1;
        while(temp!=null){
            if(i%2==0){
                even.next = temp;
                even = even.next;
            }
            else{
                odd.next = temp;
                odd = odd.next;
            }

            temp = temp.next;
            i++;
        }
        odd.next = evenHead.next;
        even.next = null;
        return oddHead.next;
    }
}