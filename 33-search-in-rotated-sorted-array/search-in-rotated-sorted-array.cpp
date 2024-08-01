class Solution {
public:
    int search(vector<int>& nums, int target) {
        int pivot = 0;
        for(int i=1;i<nums.size();i++){
            if(nums[i]<nums[i-1]){
                pivot = i;
            }
        }
        int ans=-1;
        int low = 0;
        int high = nums.size()-1;
        while(low<=high){
            int mid = low+((high-low)/2);
            int curr = (mid+pivot)%(nums.size());
            if(nums[curr]==target){
                ans = curr;
                break;
            }
            else if(nums[curr]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;

    }
};