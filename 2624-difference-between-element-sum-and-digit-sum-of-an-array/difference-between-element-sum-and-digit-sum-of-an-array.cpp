class Solution {
public:
    int differenceOfSum(vector<int>& nums) {
        int ele=0,digit=0;
        for(int i=0;i<nums.size();i++){
            if(nums[i]>9){
                int temp = nums[i];
                while(temp>0){
                    digit+=temp%10;
                    temp = temp/10;
                }
            }
            else{
                digit+=nums[i];
            }
            ele+=nums[i];
        }
        return abs(ele-digit);
    }
};