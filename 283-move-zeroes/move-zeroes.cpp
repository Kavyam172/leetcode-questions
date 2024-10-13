class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int length = nums.size();
        int i=0;
        while(i<length){
            if(nums[i]==0){
                int j=i;
                while(j<length-1){
                    nums[j]=nums[j+1];
                    j++;
                }
                nums[length-1] = 0;
                length--;
            }
            else{
                i++;
            }
        }
    }
};