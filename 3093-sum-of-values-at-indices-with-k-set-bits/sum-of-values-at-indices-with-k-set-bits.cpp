class Solution {
public:
    int sumIndicesWithKSetBits(vector<int>& nums, int k) {
        int sum=0;
        for(int i=0;i<nums.size();i++){
            int count = 0;
            int temp=i;
            while (temp) {
                count += temp & 1;
                temp >>= 1;
            }
            if(count==k){
                sum+=nums[i];
            }
        }
        return sum;
    }
};