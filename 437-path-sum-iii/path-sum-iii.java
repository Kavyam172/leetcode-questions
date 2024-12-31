/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int ans = 0;
    public void helper2(TreeNode root,int targetSum,long currSum){
        if(root==null){
            return;
        }
        currSum+=root.val;
        if(currSum==targetSum){
            ans++;
        }
        helper2(root.left,targetSum,currSum);
        helper2(root.right,targetSum,currSum);
    }
    public void helper(TreeNode root,int targetSum){
        if(root==null){
            return;
        }

        helper(root.left,targetSum);
        helper2(root,targetSum,0);
        helper(root.right,targetSum);
    }
    public int pathSum(TreeNode root, int targetSum) {
        helper(root,targetSum);
        return ans;
    }
}