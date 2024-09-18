class Solution {
public:
    int maximumProduct(vector<int>& nums) {
        int l = nums.size();
        sort(nums.begin(),nums.end());
        int maxp;
        maxp = max(nums[l-1]*nums[l-2]*nums[l-3],nums[l-1]*nums[0]*nums[1]);
        return maxp;
    }
};