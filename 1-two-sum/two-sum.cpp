class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        map<int,int> hash;
        vector<int> result;
        for(int i=0;i<nums.size();i++){
            int comp = target - nums[i];
            if(hash.find(comp)!=hash.end()){
                result.push_back(hash[comp]);
                result.push_back(i);
                return result;
            }
            hash[nums[i]] = i;
        }
        return result;
    }
};