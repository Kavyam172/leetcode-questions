class Solution {
    public int maxVowels(String s, int k) {
        int i=0;
        int j=i+k;
        int cnt=0;
        while(i<j){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                cnt++;
            }
            i++;
        }
        int maxcnt = cnt;
        i=0;
        while(j<s.length()){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                cnt--;
            }
            i++;
            if(s.charAt(j)=='a' || s.charAt(j)=='e' || s.charAt(j)=='i' || s.charAt(j)=='o' || s.charAt(j)=='u'){
                cnt++;
            }
            j++;
            if(cnt>maxcnt){
                maxcnt = cnt;
            }
        }
        return maxcnt;

    }
}