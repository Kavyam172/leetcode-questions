class Solution {
    public int helper(String str,int i,int j,int[][] dp){
        if(i>=str.length() || j<0){
            return 0;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        if(str.charAt(i)==str.charAt(j)){
            return dp[i][j] = 1 + helper(str,i+1,j-1,dp);
        }

        int dropi = helper(str,i+1,j,dp);
        int dropj = helper(str,i,j-1,dp);

        return dp[i][j] = Math.max(dropi,dropj);
    }
    public int longestPalindromeSubseq(String s) {
        int[][] dp = new int[s.length()][s.length()];
        for(int[] i:dp){
            Arrays.fill(i,-1);
        }
        return helper(s,0,s.length()-1,dp);
    }
}