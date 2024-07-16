class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        map<int,int> pre;
        int sum = 0;
        int count =0;
        for(int i=0;i<nums.size();i++){
            sum+=nums[i];
            if(sum==k){
                count++;
            }
            int rem = sum-k;
            if(pre.find(rem)!=pre.end()){
                count+=pre[rem];
            }
            pre[sum]++;
        }
        return count;
    }
};