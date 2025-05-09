class Solution {
public:
    string mergeAlternately(string word1, string word2) {
        string ans;
        int l = min(word1.length(),word2.length());
        int i=0;
        while(i<l){
            ans+=word1[i];
            ans+=word2[i];
            i++;
        }

        while(i<word1.length()){
            ans+=word1[i];
            i++;
        }
        while(i<word2.length()){
            ans+=word2[i];
            i++;
        }
        return ans;
    }
};