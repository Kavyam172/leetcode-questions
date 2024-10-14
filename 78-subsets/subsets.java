class Solution {
    public static void helper(int[] arr,int i,List<List<Integer>> ans,List<Integer> curr){
        if(i >= arr.length){
            ans.add(new ArrayList<>(curr));
            return;
        }

        curr.add(arr[i]);
        helper(arr,i+1,ans,curr);
        curr.remove(curr.size()-1);
        helper(arr,i+1,ans,curr);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        helper(nums,0,ans,curr);
        return ans;
    }
}