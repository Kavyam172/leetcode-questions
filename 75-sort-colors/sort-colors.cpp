class Solution {
public:
    void swap(int& a, int& b){
        int temp = a;
        a = b;
        b = temp;
        
    }
    void sortColors(vector<int>& nums) {
        int low=0;
        int high = nums.size()-1;
        int ele = 0;
        while(ele<=high){
            if(nums[ele]==0){
                swap(nums[low],nums[ele]);
                low++;
                ele++;
            }
            else if(nums[ele]==1){
                ele++;
            }
            else{
                swap(nums[high],nums[ele]);
                high--;
            }
        }
    }
};