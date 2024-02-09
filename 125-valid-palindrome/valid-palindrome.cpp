class Solution {
public:
    bool isPalindrome(string s) {
        int l=s.length();
        string s2="";
        int flag=0;
        for(int i=0;i<l;i++){
            if(!(isalnum(s[i]))){
                continue;
            }
            else{
                s2+=tolower(s[i]);
            }
        }
        int l2=s2.length();
        for(int i=0;i<l2/2;i++){
            if(s2[i]!=s2[l2-(i+1)]){
                flag=1;
                break;
            }           
        }
        if(flag){
            return false;
        }
        else{
            return true;
        }
    }
};