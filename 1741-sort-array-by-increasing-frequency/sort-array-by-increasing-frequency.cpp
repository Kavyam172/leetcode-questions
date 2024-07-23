class Solution {
public:
    vector<int> frequencySort(vector<int>& nums) {
        vector<int> res;
        map<int,int> freq;
        for(int i=0;i<nums.size();i++){
            freq[nums[i]]++;
        }

        sort(nums.begin(),nums.end(),[&freq](int a,int b){
            return (freq[a]==freq[b] ? a>b : freq[a]<freq[b]);
        });

        return nums;



    }
};