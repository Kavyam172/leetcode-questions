class Solution {
public:
    string reverseWords(string s) {
        string temp = "";
        string ans;
        int l = s.length()-1;
        int i=0;
        while(s[i]==' '){
            i++;
        }
        while(s[l]==' '){
            l--;
        }
        while(i<=l){
            if(s[i]==' '){
                while(s[i]==' '){
                    i++;
                }
                temp = temp+ans;
                ans = ' '+temp;
                temp = "";
                continue;
            }
            else{
                temp+=s[i];
            }
            i++;
        }
        temp = temp+ans;
        ans = temp;
        return ans;
    }
};