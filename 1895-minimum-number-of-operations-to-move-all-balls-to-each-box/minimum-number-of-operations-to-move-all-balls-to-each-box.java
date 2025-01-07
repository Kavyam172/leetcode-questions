class Solution {
    public int[] minOperations(String boxes) {
        int l = boxes.length();
        int[] ans = new int[l];
        for(int i=0;i<l;i++){
            int cnt = 0;
            for(int j=0;j<l;j++){
                if(boxes.charAt(j) == '1'){
                    cnt+=Math.abs(i-j);
                }
            }
            ans[i] = cnt;
        }
        return ans;
    }
}