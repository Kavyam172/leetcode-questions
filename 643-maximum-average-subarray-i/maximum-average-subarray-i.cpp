class Solution {
public:
    double findMaxAverage(vector<int>& nums, int k) {
        double maxavg;
        int i=0;
        int j=k-1;
        double sum=0;
        while(i<=j){
            sum+=nums[i];
            i++;
        }
        maxavg = sum/k;
        i=0;
        while(j<nums.size()-1){
            sum-=nums[i];
            i++;
            sum+=nums[j+1];
            j++;
            cout<<sum<<endl;
            maxavg = max(maxavg,(sum/k));
        }
        return maxavg;
    }
};