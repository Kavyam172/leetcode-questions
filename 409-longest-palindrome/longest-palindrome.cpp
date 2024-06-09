class Solution {
public:
    int longestPalindrome(string s) {
        map<char,int> m;
        int ans=0;
        for(int i=0;i<s.length();i++){
            m[s[i]]++;
        }
        for(auto i:m){
            if(i.second%2==0){
                ans+=i.second;
            }
            else{
                ans+=i.second-1;
            }
        }
        if(ans%2==0 && ans<s.length()){
            return ans+1;
        }
        else{
            return ans;
        }
    }
};