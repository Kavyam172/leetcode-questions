/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
        if(head==NULL){
            return NULL;
        }
        ListNode* temp = new ListNode();
        temp = head;
        map<ListNode* , int> m;
        while(temp != NULL){
            if(m[temp]>0){
                return temp;
            }
            m[temp]++;
            temp = temp->next;
        }
        return NULL;
        
    }
};