class Solution {
    public long minimumSteps(String s) {
        char[] str = s.toCharArray();
        int j = str.length-1;
        long cnt = 0;
        long zeros = 0;
        
        while(j>=0){
            if(str[j]=='0'){
                zeros++;
            }
            if(str[j]=='1'){
                cnt+=zeros;
            }
            j--;

        }
        return cnt;

    }
}