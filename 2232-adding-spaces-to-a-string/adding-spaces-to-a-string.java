class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder str = new StringBuilder();
        int idx = 0;
        for(int i=0;i<s.length();i++){
            if(idx<spaces.length && i==spaces[idx]){
                str.append(" ");
                str.append(s.charAt(i));
                idx++;
            }
            else{
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}