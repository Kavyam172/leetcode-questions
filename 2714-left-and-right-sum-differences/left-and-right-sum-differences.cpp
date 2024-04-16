class Solution {
public:
    vector<int> leftRightDifference(vector<int>& nums) {
        vector<int> ans;
        vector<int> leftsum;
        vector<int> rightsum;
        int total=0;
        for(int i=0;i<nums.size();i++){
            total+=nums[i];
        }
        int left=0,right=0;
        for(int i=0;i<nums.size();i++){
            leftsum.push_back(left);
            rightsum.push_back(total-left-nums[i]);
            left+=nums[i];
        }
        for(int i=0;i<leftsum.size();i++){
            ans.push_back(abs(leftsum[i]-rightsum[i]));
        }
        return ans;
    }
};