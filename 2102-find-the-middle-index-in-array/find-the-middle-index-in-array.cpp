class Solution {
public:
    int findMiddleIndex(vector<int>& nums) {
        int total=0;
        int left = 0;
        int right=0;
        for(int i=0;i<nums.size();i++){
            total+=nums[i];
        }
        for(int i=0;i<nums.size();i++){
            right=total-left-nums[i];
            if(left==right){
                return i;
            }
            left+=nums[i];
            // cout<<left<<' '<<right<<'\n';
        }
        return -1;
    }
};