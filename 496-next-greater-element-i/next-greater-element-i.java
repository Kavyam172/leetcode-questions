class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        Map<Integer,Integer> mp = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<nums1.length;i++){
            mp.put(nums1[i],i);
        }

        for(int i=nums2.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<nums2[i]){
                st.pop();
            }

            if(st.isEmpty()){
                if(mp.containsKey(nums2[i])){
                    ans[mp.get(nums2[i])] = -1;
                }
                st.push(nums2[i]);

            }
            else{
                if(mp.containsKey(nums2[i])){
                    ans[mp.get(nums2[i])] = st.peek();
                }
                st.push(nums2[i]);
            }
            
        }
        return ans;
    }
}