class Solution {
public:
    int maxSubarraySumCircular(vector<int>& nums) {
        int max1 = INT_MIN;
        int max2 = INT_MIN;
        int total = 0;
        int sum = 0;
        int sum2 = 0;
        for(int i=0;i<nums.size();i++){
            sum+=nums[i];
            sum2+=(nums[i]*-1);
            total+=nums[i];
            if(sum>max1){
                max1 = sum;
            }
            if(sum2>max2){
                max2 = sum2;
            }
            if(sum<0){
                sum = 0;
            }
            if(sum2<0){
                sum2 = 0;
            }
        }
        if(total+max2==0)return max1;
        return max(max1,total+max2);
    }
};