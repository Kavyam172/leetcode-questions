class Solution {
public:
    int balancedStringSplit(string s) {

        int cntr = 0;
        int cntl = 0;
        int ans = 0;
        for(int i=0;i<s.length();i++){
            if(s[i]=='R'){
                cntr++;
            }
            else if(s[i]=='L'){
                cntl++;
            }
            if(cntr==cntl){
                ans++;
                cntr = 0;
                cntl = 0;
            }
        }
        return ans;
        
    }
};