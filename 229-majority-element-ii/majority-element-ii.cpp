class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {
        map<int,int> freq;
        vector<int> res;
        for(int i=0;i<nums.size();i++){
            freq[nums[i]]++;
        }
        int n = nums.size();
        for(auto iter:freq){
            if(iter.second>(n/3)){
                res.push_back(iter.first);
            }
        }
        return res;
    }
};