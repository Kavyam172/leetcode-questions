class Solution {
    public String makeFancyString(String s) {
        StringBuilder ans=new StringBuilder();
        int i=1;
        int cnt = 1;
        ans.append(s.charAt(0));
        while(i<s.length()){
            if(s.charAt(i)==s.charAt(i-1)){
                cnt++;
            }
            else{
                cnt = 1;
            }
            if(cnt<3){
                ans.append(s.charAt(i));
            }
            i++;
        }
        return ans.toString();
    }
}