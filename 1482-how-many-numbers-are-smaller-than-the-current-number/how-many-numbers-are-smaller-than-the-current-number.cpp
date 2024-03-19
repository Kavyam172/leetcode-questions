class Solution {
public:
    vector<int> smallerNumbersThanCurrent(vector<int>& nums) {
        map<int,int> m;
        for(int i=0;i<nums.size();i++){
            m[nums[i]]++;
        }
        for(int i = 0;i<nums.size();i++){
            int count = 0;
            for(auto iter:m){
                if(iter.first==nums[i]){
                    break;
                }
                count+=iter.second;
            }
            nums[i] = count;
        }
        return nums;
        
    }
};