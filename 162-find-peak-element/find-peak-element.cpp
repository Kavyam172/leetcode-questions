class Solution {
public:
    int findPeakElement(vector<int>& nums) {
        int high = nums.size()-1;
        int low = 0;
        int mid = (low + high)/2;
        while(mid != low && mid!=high){
            if(nums[mid-1]<nums[mid] && nums[mid + 1]<nums[mid]){
                return mid;
            }
            else if(nums[mid-1]<nums[mid] && nums[mid + 1]>nums[mid]){
                low=mid;
            }
            else if(nums[mid-1]>nums[mid] && nums[mid + 1]<nums[mid]){
                high = mid;
            }
            else{
                if(nums[mid-1]<nums[mid + 1]){
                    low = mid;
                }
                else{
                    high = mid;
                }
            }
            mid = (low + high)/2;
        }
        if(nums[low]>nums[high]){
            return low;
        }
        else{
            return high;
        }
    }
};