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
    void preorder(TreeNode* Node,vector<int>& tree){
        if(Node==NULL){
            return;
        }

        tree.push_back(Node->val);
        preorder(Node->left,tree);
        preorder(Node->right,tree);
    }


    vector<int> preorderTraversal(TreeNode* root) {
        vector<int> tree;
        preorder(root, tree);
        return tree;

    }
};