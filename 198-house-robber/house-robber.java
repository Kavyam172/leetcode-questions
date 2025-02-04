class Solution {
    public int helper(int[] nums,int n,int prev,int[][] dp){
        if(n>=nums.length){
            return 0;
        }

        if(dp[n][prev]!=-1){
            return dp[n][prev];
        }

        int include = nums[n] + helper(nums,n+1,1,dp);
        int exclude = helper(nums,n+1,0,dp);
        if(prev==1){
            dp[n][prev] = exclude;
            return dp[n][prev];
        }

        dp[n][prev] = Math.max(include,exclude);
        return dp[n][prev];

    }
    public int rob(int[] nums) {
        int[][] dp = new int[nums.length+1][2];
        for(int[] i:dp){
            Arrays.fill(i,-1);
        }
        return helper(nums,0,0,dp);
    }
}