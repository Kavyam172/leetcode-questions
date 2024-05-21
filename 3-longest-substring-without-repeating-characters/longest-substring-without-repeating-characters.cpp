class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int l = 0;
        int r = 0;
        int max=0;
        map<char, int> hash;
        while(r<s.length()){
            if(hash.find(s[r])!=hash.end() && hash[s[r]]>=l){
                l=hash[s[r]]+1;
                hash[s[r]] = r;
                r++;
                continue;
            }
            hash[s[r]] = r;
            int len = r-l+1;
            if(len>max){
                max=len;
            }
            r++;
        }
        return max;
    }
};