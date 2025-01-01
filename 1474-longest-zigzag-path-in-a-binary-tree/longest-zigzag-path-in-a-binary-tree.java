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
    int maxm = 0;
    public void helper(TreeNode root,int dir,int len){
        if(root==null){
            return;
        }

        maxm = Math.max(maxm,len);

        if(dir==-1){
            helper(root.left,0,len+1);
            helper(root.right,1,len+1);
        }

        if(dir==0){
            helper(root.right,1,len+1);
            helper(root.left,0,1);
        }

        if(dir==1){
            helper(root.left,0,len+1);
            helper(root.right,1,1);
        }

        
    }
    public int longestZigZag(TreeNode root) {
        helper(root,-1,0);
        return maxm;
    }
}