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
    public int preorder(TreeNode root,int maxm){
        if(root==null){
            return 0;
        }

        if(maxm>root.val){
            return preorder(root.left,maxm)+preorder(root.right,maxm);

        }
        maxm = root.val;
        return 1+preorder(root.left,maxm)+preorder(root.right,maxm);
    }
    public int goodNodes(TreeNode root) {
        int maxm = Integer.MIN_VALUE;
        return preorder(root,maxm);
    }
}