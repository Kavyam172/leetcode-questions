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
    public int pairSum(ListNode head) {
        if(head==null){
            return 0;
        }
        ListNode temp = head;
        int l = 0;
        while(temp!=null){
            l++;
            temp = temp.next;
        }
        if(l==2){
            return head.val+head.next.val;
        }
        if(l==1){
            return head.val;
        }
        temp = head;
        int i=0;  
        int max=0;
        while(i<l/2){
            temp = temp.next;
            i++;
        } 
        ListNode p = temp;
        ListNode c = temp.next;
        ListNode n = temp.next.next;
        while(n!=null){
            c.next = p;
            p = c;
            c = n;
            n = n.next;
        }
        c.next = p;
        i = 0;
        temp = head;
        while(i<l/2){
            int sm = temp.val+c.val;
            if(sm>max){
                max = sm;
            }
            temp = temp.next;
            c = c.next;
            i++;
        }
        return max; 
    }
}