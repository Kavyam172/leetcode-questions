class Solution {
public:
    bool check(vector<int>& nums) {
        int l=nums.size();
        int count=0;
        for(int i=0;i<l-1;i++){
            if(nums[i]>nums[i+1]){
                count++;
            }
        }
        if(nums[l-1]>nums[0]){
            count++;
        }
        if(count<=1){
            return true;
        }
        else{
            return false;
        }
        return true;
    }
};