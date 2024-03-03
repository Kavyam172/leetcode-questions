class Solution {
public:
    vector<int> shuffle(vector<int>& nums, int n) {
        vector<int> x;
        vector<int> y;
        for(int i=0;i<2*n;i++){
            if(i<n){
                x.push_back(nums[i]);
            }
            else{
                y.push_back(nums[i]);
            }
        }
        int xind = 0;
        int yind = 0;
        for(int i=0;i<2*n;i++){
            if(i%2==0){
                nums[i]= x[xind];
                xind++;
            }
            else{
                nums[i] = y[yind];
                yind++;
            }
        }
        return nums;
    }
};