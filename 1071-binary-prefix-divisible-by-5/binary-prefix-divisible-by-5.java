class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans = new ArrayList<>(nums.length);

        int xi = 0;

        for(int i=0;i<nums.length;i++){
            xi = ((xi<<1)+nums[i])%5;
            if(xi==0){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }

        return ans;
    }
}