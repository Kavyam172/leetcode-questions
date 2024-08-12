class Solution {
public:
    int smallestDivisor(vector<int>& nums, int threshold) {
        int maxm = nums[0];
        int minm = nums[0];
        for(int i=1;i<nums.size();i++){
            maxm = max(nums[i],maxm);
            minm = min(nums[i],minm);
        }
        int res = 0;
        int low = 1;
        int high = maxm;
        int div;
        while(low<=high){
            int mid = (low+high)/2;
            for(int j=0;j<nums.size();j++){
                res+=ceil((double)nums[j]/mid);
            }
            if(res<=threshold){
                div = mid;
                high = mid-1;
            }
            if(res>threshold){
                low = mid+1;
            }
            res = 0;
        }
        return div;
    }
};