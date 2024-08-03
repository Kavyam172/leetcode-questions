class Solution {
public:
    int findMin(vector<int>& nums) {
        int low = 0;
        int high = nums.size()-1;
        int ans = nums[0];
        if(nums.size()==1){
            return ans;
        }
        while(low<=high){
            int mid = low+((high-low)/2);
            if(mid>0){
                if(nums[mid-1]>nums[mid]){
                    ans = nums[mid];
                    break;
                }
                else{
                    if(nums[mid]>ans){
                        low = mid+1;
                    }
                    else if(nums[mid]<ans){
                        high = mid-1;
                    }
                }
            }
            else if(mid==0){
                low = mid+1;
            }
        }
        return ans;
    }
};