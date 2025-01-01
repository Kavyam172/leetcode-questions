class Solution {
    public int maxScore(String s) {
        int zeros = 0;
        int ones = 0;

        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            if(curr=='1'){
                ones++;
            }
        }

        int ans = Integer.MIN_VALUE;

        for(int i=0;i<s.length()-1;i++){
            char curr = s.charAt(i);
            if(curr=='0'){
                zeros++;
            }
            else{
                ones--;
            }

            ans = Math.max(ans,zeros+ones);
        }
        return ans;
    }
}