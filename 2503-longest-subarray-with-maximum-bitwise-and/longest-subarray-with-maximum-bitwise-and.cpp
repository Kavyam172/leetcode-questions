class Solution {
public:
    int longestSubarray(vector<int>& nums) {
        int maxm = 0;
        for(int i=0;i<nums.size();i++){
            if(nums[i]>maxm){
                maxm = nums[i];
            }
        }

        int len = 1;
        int cnt = 0;
        for(int i=0;i<nums.size();i++){
            if(nums[i]==maxm){
                cnt++;
            }
            else{
                len = max(cnt,len);
                cnt = 0;
            }
        }
        len = max(cnt,len);
        return len;
    }
};