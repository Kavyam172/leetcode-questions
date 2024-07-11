class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int start=0;
        int end =0;
        int count = 0;
        int max=0;
        while(end<nums.size()){
            if(nums[end]==0){
                start = end+1;
                end++;
                if(count>max){
                    max = count;
                }
                count = 0;
                continue;
            }
            end++;
            count++;
        }
        if(count>max){
            max = count;
        }
        return max;
    }
};