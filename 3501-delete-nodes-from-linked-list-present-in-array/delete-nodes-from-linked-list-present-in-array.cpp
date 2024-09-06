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
    ListNode* modifiedList(vector<int>& nums, ListNode* head) {
        ListNode* prev = new ListNode(0);
        prev->next = head;
        ListNode* curr = prev;
        unordered_map<int,int> hash;
        for(int i=0;i<nums.size();i++){
            hash[nums[i]]++;
        }
        while(curr->next!=NULL){
            int i=0;
            if(hash.find(curr->next->val)!=hash.end()){
                curr->next = curr->next->next;
            }
            else{
                curr = curr->next;
            }
        }
        return prev->next;
    }
};