/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    bool level(TreeNode* node){
        if(node==NULL){
            return true;
        }
        queue<TreeNode*> q;
        q.push(node);
        int lvl = 0;
        while(!q.empty()){
            int size = q.size();
            int prev = (lvl%2==0) ? INT_MIN : INT_MAX ;
            for(int i=0;i<size;i++){
                TreeNode* curr = q.front();
                q.pop();
                if(lvl%2==0){
                    if(curr->val%2==0 || curr->val<=prev){
                        return false;
                    }
                }
                else{
                    if(curr->val%2!=0 || curr->val>=prev){
                        return false;
                    }
                }
                prev = curr->val;
                if(curr->left!=NULL){
                    q.push(curr->left);
                }
                if(curr->right!=NULL){
                    q.push(curr->right);
                }
            }
            lvl++;
        }
        return true;
    }
    bool isEvenOddTree(TreeNode* root) {
        bool res = level(root);
        return res;
    }
};