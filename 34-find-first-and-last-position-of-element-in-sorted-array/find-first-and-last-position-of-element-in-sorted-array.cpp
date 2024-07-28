class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        vector<int> result;
        int low = 0;
        int high = nums.size()-1;
        int mid = (low+high)/2;
        int start = -1,end = -1;
        // if(nums.size()==1 && nums[0]==target){
        //     return {0,0};
        // }
        while(low<=high){
            if(nums[mid]==target){
                start = mid;
                end = mid;
                break;
            }
            else if(nums[mid]>target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
            mid = (low+high)/2;
        }
        while(start>0 && nums[start-1]==target){
            start--;
        }
        while(end<nums.size()-1 && nums[end+1]==target){
            end++;
        }

        return {start,end};

    }
};