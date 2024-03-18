/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        if(head==NULL || head->next == NULL){
            return head;
        }
        ListNode* temp = new ListNode();
        ListNode* front = new ListNode();
        ListNode* prev = new ListNode();
        temp = head;
        front = head->next;
        prev = NULL;
        while(temp->next!=NULL){
            temp->next = prev;
            prev = temp;
            temp = front;
            front = front->next;
        }
        temp->next = prev;
        head = temp;
        return head;
    }
};