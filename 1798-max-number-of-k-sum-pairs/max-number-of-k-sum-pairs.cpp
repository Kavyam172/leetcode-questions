class Solution {
public:
    int maxOperations(vector<int>& nums, int k) {
        int i=0;
        int j=nums.size()-1;
        int cnt=0;
        sort(nums.begin(),nums.end());
        while(i<j){
            if(nums[i]+nums[j]==k){
                cnt++;
                i++;
                j--;
            }
            else if(nums[i]+nums[j]>k){
                j--;
            }
            else{
                i++;
            }
        }
        return cnt;
    }
};