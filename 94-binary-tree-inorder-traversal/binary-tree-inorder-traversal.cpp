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
    void inorder(TreeNode* Node, vector<int>& tree){
        if(Node==NULL){
            return;
        }

        inorder(Node->left,tree);
        tree.push_back(Node->val);
        inorder(Node->right,tree);
    }
    vector<int> inorderTraversal(TreeNode* root) {
        vector<int> tree;
        inorder(root, tree);
        return tree;
    }
};