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
    int height(TreeNode* node){
        if(node==NULL){
            return 0;
        }
        return 1 + max(height(node->left),height(node->right));
    }
    int diameter(TreeNode* node,int& d){
        if(node == NULL){
            return 0;
        }

        d = max(d,height(node->left)+height(node->right));
        diameter(node->left,d);
        diameter(node->right,d);


        return d;
    }
    int diameterOfBinaryTree(TreeNode* root) {
        if(root == NULL){
            return 0;
        }
        int d=0;
        diameter(root,d);
        return d;
    }
};