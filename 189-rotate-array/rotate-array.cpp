class Solution {
public:
    void reverse(vector<int>& nums,int start,int end){
        int l = end - start;
        for(int i = 0;i<(l/2);i++){
            int temp = nums[i+start];
            nums[i+start] = nums[end-i-1];
            nums[end-i-1] = temp;
        }
    }

    void rotate(vector<int>& nums, int k) {
        int l=nums.size();
        k=k%l;
        reverse(nums,l-k,l);
        reverse(nums,0,l-k);
        reverse(nums,0,l);

    }
};