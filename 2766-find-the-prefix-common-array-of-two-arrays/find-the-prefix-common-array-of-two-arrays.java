class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] ans = new int[A.length];
        int cnt = 0;
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<A.length;i++){
            if(A[i]==B[i]){
                cnt++;
                ans[i] = cnt;
                continue;
            }

            if(mp.containsKey(A[i]) && mp.get(A[i])>0){
                mp.put(A[i],mp.get(A[i])-1);
                cnt++;
            }
            else{
                mp.put(A[i],mp.getOrDefault(A[i],0)+1);
            }
            if(mp.containsKey(B[i]) && mp.get(B[i])>0){
                mp.put(B[i],mp.get(B[i])-1);
                cnt++;
            }
            else{
                mp.put(B[i],mp.getOrDefault(B[i],0)+1);
            }
            ans[i] = cnt;
        }
        return ans;
    }
}