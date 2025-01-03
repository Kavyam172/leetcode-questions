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
    public int height(TreeNode node){
        if(node==null){
            return 0;
        }
        
        return 1+Math.max(height(node.left),height(node.right));
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        int l = height(root.left);
        int r = height(root.right);
        if(l>r+1 || r>l+1){
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }
}