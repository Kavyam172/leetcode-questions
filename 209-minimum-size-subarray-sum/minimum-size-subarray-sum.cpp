class Solution {
public:
    int minSubArrayLen(int target, vector<int>& nums) {
        int sum = 0;
        int ans = INT_MAX;
        int i=0;
        int j=0;
        while(j<nums.size()){
            sum+=nums[j];
            while(sum>=target){
                ans = min(ans,j-i+1);
                sum-=nums[i];
                i++;
            }
            j++;
        }
        if(i==0 && sum<target){
            return 0;
        }
        return ans;
    }
};