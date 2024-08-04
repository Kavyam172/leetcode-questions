class Solution {
public:
    int minSwaps(vector<int>& nums) {
        int ones = 0;
        int n = nums.size();
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                ones+=1;
            }
            nums.push_back(nums[i]);
        }
        int i=0;
        int j = i+ones-1;
        int swaps = INT_MAX;
        int temp = i; 
        int zeros = 0;
        while(temp<=j && zeros<swaps){
            if(nums[temp] == 0){
                zeros+=1;
            }
            temp++;
        }
        while(i<n){
            if(zeros==0){
                return 0;
            }
            if(zeros<swaps){
                swaps = zeros;
            }
            if(nums[i]==0){
                zeros-=1;
            }
            i++;
            j++;
            if(nums[j]==0){
                zeros+=1;
            }
        }
        return swaps;
    }
};