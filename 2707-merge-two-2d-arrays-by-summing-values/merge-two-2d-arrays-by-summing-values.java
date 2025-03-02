class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer,Integer> hash = new TreeMap<>();

        for(int[] i:nums1){
            hash.put(i[0],hash.getOrDefault(i[0],0)+i[1]);
        }
        
        for(int[] i:nums2){
            hash.put(i[0],hash.getOrDefault(i[0],0)+i[1]);
        }

        int[][] ans = new int[hash.size()][2];
        int i = 0;
        for(Map.Entry<Integer,Integer> en:hash.entrySet()){
            ans[i] = new int[]{en.getKey(),en.getValue()};
            i++;
        }
        return ans;
    }
}