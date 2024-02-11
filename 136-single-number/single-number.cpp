class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int result=0;
        int l=nums.size();
        for(int i=0;i<l;i++){
            result^=nums[i];
        }
        return result;
    }
};