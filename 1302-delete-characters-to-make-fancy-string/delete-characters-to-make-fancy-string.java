class Solution {
    public String makeFancyString(String s) {
        int cnt=1,i=0;
        StringBuilder res=new StringBuilder();
        for(i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1)) cnt++;
            else cnt=1;
            if(cnt<3) res.append(s.charAt(i));
        }
        res.append(s.charAt(i));
        return res.toString();
    }
}