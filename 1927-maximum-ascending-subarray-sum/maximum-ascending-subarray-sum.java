class Solution {
    public int isinc(int[] nums,int start,int end){
        int sum = nums[start];
        for(int i=start+1;i<=end;i++){
            if(nums[i]<=nums[i-1]){
                return -1;
            }

            sum+=nums[i];
        }
        return sum;
    }
    public int maxAscendingSum(int[] nums) {
        int l= 0;
        int r = 0;
        int maxm = Integer.MIN_VALUE;

        while(r<nums.length){
            int sum = isinc(nums,l,r);
            if(sum==-1){
                l = r;
                continue;
            }
            maxm = Math.max(maxm,sum);
            r++;
        }
        return maxm;
    }
}