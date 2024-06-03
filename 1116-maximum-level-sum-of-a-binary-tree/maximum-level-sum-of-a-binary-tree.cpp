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
    void level(TreeNode* node, int& max){
        if(node==NULL){
            return;
        }

        queue<TreeNode*> q;
        q.push(node);
        int lvl = 0;
        int maxsum = INT_MIN;
        while(!q.empty()){
            int size = q.size();
            int sum = 0;
            lvl++;
            for(int i=0;i<size;i++){
                TreeNode* curr = q.front();
                q.pop();
                sum += curr->val;
                if(curr->left!=NULL){
                    q.push(curr->left);
                }
                if(curr->right!=NULL){
                    q.push(curr->right);
                }
            }
            if(sum>maxsum){
                max = lvl;
                maxsum = sum;
                cout<<sum<<endl;
            }
        }
    }
    int maxLevelSum(TreeNode* root) {
        int max = 0;
        level(root,max);
        return max;
        
    }
};