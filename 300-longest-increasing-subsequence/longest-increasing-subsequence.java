class Solution {
    
    public int lengthOfLIS(int[] nums) {
        if(nums.length==0){
            return 0;
        }

        int[] dp = new int[nums.length];
        int l = 0;

        for(int num:nums){
            int idx = Arrays.binarySearch(dp,0,l,num);
            if(idx<0){
                idx = -(idx+1);
            }
            dp[idx] = num;
            if(idx==l){
                l++;
            }
        }

        return l;
    }
}