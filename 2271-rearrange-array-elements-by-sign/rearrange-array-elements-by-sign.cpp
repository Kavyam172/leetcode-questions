class Solution {
public:
    vector<int> rearrangeArray(vector<int>& nums) {
        vector<int> p;
        vector<int> n;
        for(int i=0;i<nums.size();i++){
            if(nums[i]>0){
                p.push_back(nums[i]);
            }
            else{
                n.push_back(nums[i]);
            }
        }
        int x=0;
        for(int i=0;i<nums.size();i+=2){
            nums[i] = p[x];
            nums[i+1] = n[x];
            x++;
        }
        return nums;
    }
};