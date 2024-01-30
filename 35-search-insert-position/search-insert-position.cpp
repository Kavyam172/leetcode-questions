class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        int ans=-1;
        int start=0;
        int end=nums.size()-1;
        int mid=(start+end)/2;
        if(target>nums[end]){
            return end+1;
        }
        else if(target<nums[start]){
            return start;
        }
        
        while(start<=end){
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            mid=(start+end)/2;
        }

        start=0;
        end=nums.size()-1;

        while(start<=end){
            mid=(start+end)/2;
            if(nums[mid]<target){
                if(nums[mid+1]>target){
                    return mid+1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(nums[mid-1]<target){
                    return mid;
                }
                else{
                    end=mid-1;
                }
            }
            
        }
        return ans;
    }
};