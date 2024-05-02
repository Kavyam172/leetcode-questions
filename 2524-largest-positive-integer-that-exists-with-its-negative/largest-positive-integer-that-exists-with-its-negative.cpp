class Solution {
public:
    int findMaxK(vector<int>& nums) {
        unordered_map<int,int> pos;
        unordered_map<int,int> neg;
        int ans = -1;
        for(int i=0;i<nums.size();i++){
            if(nums[i]>0){
                pos[nums[i]] = 1;
            }
            else{
                neg[nums[i]] = 1;
            }
        }
        for(auto iter:pos){
            int x = iter.first*-1;
            if(neg[x]==1 && iter.first>ans){
                ans = iter.first;
            }
        }
        return ans;

    }
};