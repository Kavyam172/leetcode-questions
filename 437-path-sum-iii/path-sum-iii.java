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
    public int helper(TreeNode root,int targetSum,long currSum,Map<Long,Integer> prefix){
        if(root==null){
            return 0;
        }


        currSum+=root.val;

        int ans = 0;
        // if(root.val==targetSum){
        //     ans++;
        // }
        if(currSum==targetSum){
            ans+=1;
        }
        ans += prefix.getOrDefault(currSum-targetSum,0);

        prefix.put(currSum,prefix.getOrDefault(currSum,0)+1);

        ans+=helper(root.left,targetSum,currSum,prefix);
        ans+=helper(root.right,targetSum,currSum,prefix);

        prefix.put(currSum,prefix.getOrDefault(currSum,0)-1);

        return ans;

    }
    public int pathSum(TreeNode root, int targetSum) {
        Map<Long,Integer> prefix = new HashMap<>();
        return helper(root,targetSum,0,prefix);
    }
}