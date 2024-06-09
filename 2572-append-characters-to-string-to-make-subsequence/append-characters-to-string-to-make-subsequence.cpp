class Solution {
public:
    int appendCharacters(string s, string t) {
        int n=0;
        for(int i=0;i<s.length();i++){
            if(s[i]==t[n]){
                n++;
            }
        }
        return t.length()-n;
    }
};