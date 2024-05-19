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
    int maxSum(TreeNode* node,int &sum){
        if(node==NULL){
            return 0;
        }

        int ls = max(maxSum(node->left,sum),0);
        int rs = max(maxSum(node->right,sum),0);
        // cout<<"ls"<<ls<<"rs"<<rs<<"\n";
        sum = max(sum, ls+rs+node->val);

        return node->val + max(ls,rs);

    }
    int maxPathSum(TreeNode* root) {
        int sum =INT_MIN;
        maxSum(root,sum);

        return sum;
    }
};