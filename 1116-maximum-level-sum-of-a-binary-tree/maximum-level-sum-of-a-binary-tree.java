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
    public int bfs(TreeNode root){
        if(root==null){
            return 0;
        }
        int maxm = Integer.MIN_VALUE;
        int ans = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int lvl = 1;
        while(!q.isEmpty()){
            int l = q.size();
            int sum = 0;
            for(int i=0;i<l;i++){
                TreeNode curr = q.poll();
                sum+=curr.val;
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            if(sum>maxm){
                maxm = sum;
                ans = lvl;
            }
            lvl++;
        }
        return ans;
    }
    public int maxLevelSum(TreeNode root) {
        return bfs(root);
    }
}