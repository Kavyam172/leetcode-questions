class Solution {
    public long helper(int day,int[] prices,int k,int status,long[][][] dp){
        if(day>=prices.length){
            if(status!=0){
                return Long.MIN_VALUE/2;
            }
            return 0;
        }
        if(k==0 && status==0){
            return 0;
        }
        if(dp[day][k][status]!=-1){
            return dp[day][k][status];
        }
        if(status==1){
                
                return dp[day][k][status] = Math.max(prices[day]+helper(day+1,prices,k,0,dp),helper(day+1,prices,k,status,dp));
            
        }
        else if(status==2){
                return dp[day][k][status] = Math.max((prices[day]*-1)+helper(day+1,prices,k,0,dp),helper(day+1,prices,k,status,dp));
            


        }
        else{
            long buy = (prices[day]*-1)+helper(day+1,prices,k-1,1,dp);
            long sell = prices[day]+helper(day+1,prices,k-1,2,dp);
            long doNothing = helper(day+1,prices,k,0,dp);
            return dp[day][k][status] = Math.max(doNothing,Math.max(buy,sell));
        }
    }
    public long maximumProfit(int[] prices, int k) {
        long[][][] dp = new long[prices.length][k+1][3];
        for(int i=0;i<prices.length;i++){
            for(int j=0;j<=k;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return helper(0,prices,k,0,dp);
    }
}