class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<Integer> m1 = new HashSet<>();
        HashSet<Integer> m2 = new HashSet<>();

        for(int n:nums1){
            m1.add(n);
        }

        List<Integer> tmp = new ArrayList<>();
        for(int n:nums2){
            m2.add(n);
        }

        List<Integer> tmp2 = new ArrayList<>();
        for(int e:m1){
            if(!m2.contains(e)){
                tmp2.add(e);
            }
        }
        for(int e:m2){
            if(!m1.contains(e)){
                tmp.add(e);
            }
        }
        ans.add(tmp2);
        ans.add(tmp);
        return ans;

    }
}