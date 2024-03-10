class Solution {
public:
    int maxFrequencyElements(vector<int>& nums) {
        unordered_map<int,int> m;
        int max = 0,count = 0;
        for(int i=0;i<nums.size();i++){
            m[nums[i]]++;
        }
        for(auto iter:m){
            if(iter.second>max){
                max = iter.second;
            }
        }
        for(auto iter:m){
            if(iter.second == max){
                count+=iter.second;
            }
        }
        return count;

    }
};