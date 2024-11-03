class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        int l = goal.length();
        for(int i=0;i<l;i++){
            goal+=goal.charAt(i);
        }
        if(goal.contains(s)){
            return true;
        }
        else{
            return false;
        }
    }
}