/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    TreeNode ans;
    public boolean dfs(TreeNode root,TreeNode p,TreeNode q){
        if(root==null){
            return false;
        }

        boolean left = dfs(root.left,p,q);
        boolean right = dfs(root.right,p,q);
        boolean curr = (root.val == p.val || root.val==q.val);

        if((curr && left) || (curr && right) || (left && right)){
            ans = root;
        }

        return curr || left || right;
    }
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root,p,q);
        return ans;
    }
}