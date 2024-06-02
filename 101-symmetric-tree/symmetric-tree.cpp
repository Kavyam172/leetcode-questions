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
    bool symmetry(TreeNode* left, TreeNode* right){
        if(left==NULL && right==NULL){
            return true;
        }
        else if(left==NULL || right==NULL){
            return false;
        }

        bool l = symmetry(left->left,right->right);
        bool r = symmetry(left->right,right->left);

        return left->val==right->val && l && r;
    }
    bool isSymmetric(TreeNode* root) {
        if(root==NULL){
            return true;
        }
        return symmetry(root->left,root->right);
    }
};