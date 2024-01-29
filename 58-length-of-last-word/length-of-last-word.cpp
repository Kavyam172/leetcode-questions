class Solution {
public:
    int lengthOfLastWord(string s) {
        int count = 0;
        for(int i=s.length()-1;i>=0;i--){
            // if(s.length()==1){
            //     return 1;
            // }
            if(s[i]==' '){
                continue;
            }
            else{
                while(i>=0 && s[i]!=' '){
                    count++;
                    i--;
                }
                break;
            }
        }
        return count;
    }
};