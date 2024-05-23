class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int ans;
        int l = nums.size();
        int sum =0;
        int arrsum=0;
        for(int i=0;i<=l;i++){
            sum+=i;
        }
        for(int i=0;i<l;i++){
            arrsum+=nums[i];
        }
        return sum-arrsum; 
    }
};