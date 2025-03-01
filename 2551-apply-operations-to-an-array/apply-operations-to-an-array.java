class Solution {
    public void swap(int[] nums,int a,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public int[] applyOperations(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]*=2;
                nums[i+1] = 0;
            }
        }

        int idx = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                swap(nums,idx,i);
                idx++;
            }
        }

        return nums;
    }
}