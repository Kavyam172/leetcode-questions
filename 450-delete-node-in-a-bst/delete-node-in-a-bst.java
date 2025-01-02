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
    public TreeNode findMin(TreeNode root){
        while(root!=null && root.left!=null){
            root = root.left;
        }
        return root;
    }
    public TreeNode helper(TreeNode root,int key){
        if(root==null){
            return null;
        }
        if(root.val<key){
            root.right = helper(root.right,key);
        }
        if(root.val>key){
            root.left = helper(root.left,key);
        }
        if(root.val==key){
            if(root.right==null && root.left==null){
                return null;
            }
            if(root.right==null){
                return root.left;
            }
            if(root.left==null){
                return root.right;
            }

            TreeNode min = findMin(root.right);
            root.val = min.val;
            root.right = helper(root.right,min.val);
        }
        return root;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        return helper(root,key);
    }
}