class Solution {
public:
    int arithmeticTriplets(vector<int>& nums, int diff) {
        int l = nums.size();
        vector<int> hash(301);
        int count=0;
        for(int i=0;i<l;i++){
            hash[nums[i]]++;
        }

        for(int i=0;i<l;i++){
            if(hash[nums[i]+diff] && hash[nums[i]+diff+diff]){
                count++;
            }
        }
        return count;
    }
};