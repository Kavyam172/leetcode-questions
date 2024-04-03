class Solution {
public:
    bool isIsomorphic(string s, string t) {
        unordered_map<char,char> m;
        unordered_map<char,char> m2;
        if(s.length()!= t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(m[s[i]]==NULL){
                m[s[i]] = t[i];
            }
            else{
                if(m[s[i]]!=t[i]){
                    return false;
                }
            }
        }
        for(int i=0;i<t.length();i++){
            if(m2[t[i]]==NULL){
                m2[t[i]] = s[i];
            }
            else{
                if(m2[t[i]]!=s[i]){
                    return false;
                }
            }
        }

        return true;
    }
};