class Solution {
    public int countVowels(String s){
        int vowels = 0;
        for(char c:s.toCharArray()){
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                vowels++;
            }
        }
        return vowels;
    }
    public boolean doesAliceWin(String s) {
        int v = countVowels(s);
        if(v==0){
            return false;
        }
        else{
            return true;
        }
    }
}