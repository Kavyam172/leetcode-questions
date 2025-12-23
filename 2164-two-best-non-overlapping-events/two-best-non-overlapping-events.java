class Solution {
    public int helper(int n,int selected, int[][] events,int[][] dp){
        if(n>=events.length){
            return 0;
        }

        if(selected>=2){
            return 0;
        }

        if(dp[n][selected] != -1){
            return dp[n][selected];
        }

        int end = events[n][1];

        int low = n+1;
        int high = events.length-1;
        int mid = (low+high)/2;

        while(low<high){
            if(events[mid][0]<=end){
                low = mid+1;
            }
            else{
                high = mid;
            }
            mid = (low+high)/2;
        }

        int include = events[n][2]+(low<events.length && events[low][0]>end? helper(low,selected+1,events,dp):0);
        int exclude = helper(n+1,selected,events,dp);

        return dp[n][selected] = Math.max(include,exclude);

    }
    public int maxTwoEvents(int[][] events) {
        Arrays.sort(events,(a,b)-> a[0]-b[0]);
        int[][] dp = new int[events.length][3];
        for(int[] i:dp){
            Arrays.fill(i,-1);
        }

        return helper(0,0,events,dp);

    }
}