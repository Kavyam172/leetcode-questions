class Solution {
    private int find(StringBuilder s,String part){
        for(int i=0;i<s.length();i++){
            if(i+part.length()>s.length()){
                break;
            }
            if(s.substring(i,i+part.length()).equals(part)){
                return i;
            }
        }
        return -1;
    }
    public String removeOccurrences(String s, String part) {
        int l = s.length();
        int partl = part.length();
        StringBuilder ans = new StringBuilder(s);
        int idx = 0;
        while(idx!=-1 && ans.length()>0){
            idx=find(ans,part);
            if(idx == -1){
                break;
            }
            ans.delete(idx,idx+partl);
        }

        return ans.toString();
    }

}