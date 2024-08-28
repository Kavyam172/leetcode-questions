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
    ListNode* removeElements(ListNode* head, int val) {
        if(head==nullptr){
            return head;
        }
        while(head!=nullptr && head->val==val){
            head = head->next;
        }
        if(head==nullptr){
            return head;
        }
        ListNode* curr = head->next;
        ListNode* prev = head;
        while(curr!=nullptr){
            if(curr->val==val){
                prev->next = curr->next;
                curr = curr->next;
                continue;
            }
            prev = curr;
            curr = curr->next;
        }
        return head;
    }
};