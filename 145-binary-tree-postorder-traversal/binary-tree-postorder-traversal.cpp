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
    void postorder(TreeNode* Node,vector<int>& tree){
        if(Node==NULL){
            return;
        }

        postorder(Node->left,tree);
        postorder(Node->right,tree);
        tree.push_back(Node->val);
    }
    vector<int> postorderTraversal(TreeNode* root) {
        vector<int> tree;
        postorder(root, tree);
        return tree;
    }
};