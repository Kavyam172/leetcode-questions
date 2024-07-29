class Solution {
public:
    int maxProduct(vector<int>& nums) {
        double pre = 1;
        double suff = 1;
        double maxp = LLONG_MIN;
        int n = nums.size();
        for(int i=0;i<n;i++){
            pre *=nums[i];
            suff *=nums[n-i-1];
            maxp = max(maxp,max(pre,suff));
            if(pre==0){
                pre = 1;
            }
            if(suff==0){
                suff = 1;
            }
        }
        return (int)maxp;
    }
};