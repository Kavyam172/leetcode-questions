class Solution {
    public int helper(int[] nums,int prev,int n,int[][] dp){
        if(n>=nums.length){
            return 0;
        }

        if(prev==-1){
            dp[n][prev+1] = Math.max(helper(nums,prev,n+1,dp),1+helper(nums,n,n+1,dp));
            return dp[n][prev+1];
        }

        if(nums[n]>nums[prev]){
            if(dp[n][prev+1]!=-1){
                return dp[n][prev+1];
            }
            dp[n][prev+1] = Math.max(helper(nums,prev,n+1,dp),1+helper(nums,n,n+1,dp));
            return dp[n][prev+1];
        }

        dp[n][prev+1] = helper(nums,prev,n+1,dp);
        return dp[n][prev+1];
    }
    public int lengthOfLIS(int[] nums) {
        int[][] dp = new int[nums.length+1][nums.length];
        for(int[] i:dp){
            Arrays.fill(i,-1);
        }
        return helper(nums,-1,0,dp);
    }
}