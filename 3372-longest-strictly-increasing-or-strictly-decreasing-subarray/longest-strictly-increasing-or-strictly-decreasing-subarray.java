class Solution {
    public boolean isinc(int[] nums,int start,int end){
        if(start==end){
            return true;
        }
        for(int i=start+1;i<=end;i++){
            if(nums[i]<=nums[i-1]){
                return false;
            }
        }
        return true;
    }
    public boolean isdec(int[] nums,int start,int end){
        if(start==end){
            return true;
        }
        for(int i=start+1;i<=end;i++){
            if(nums[i]>=nums[i-1]){
                return false;
            }
        }
        return true;
    }
    public int longestMonotonicSubarray(int[] nums) {
        int r = 0;
        int l = 0;

        int maxlen = 0;
        while(r<nums.length){
            if(isinc(nums,l,r) || isdec(nums,l,r)){
                maxlen = Math.max(maxlen,r-l+1);
            }
            else{
                l++;
                r = l;
                continue;
            }
            r++;
        }

        return maxlen;
    }
}