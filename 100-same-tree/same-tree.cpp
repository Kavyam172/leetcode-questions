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

    bool same(TreeNode* node,TreeNode* node2){
        if(node==NULL && node2==NULL){
            return true;
        }
        else if(node==NULL || node2==NULL){
            return false;
        }
        bool l = same(node->left,node2->left);
        bool r = same(node->right,node2->right);
        

        return l && r && (node->val==node2->val);
    }

    bool isSameTree(TreeNode* p, TreeNode* q) {
        bool result = same(p,q);
        return result;
    }
};