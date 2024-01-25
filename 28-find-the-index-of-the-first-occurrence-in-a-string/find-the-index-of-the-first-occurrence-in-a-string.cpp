class Solution {
public:
    int strStr(string haystack, string needle) {
        int flag = 0;
        int j=0;
        int l=needle.length();
        for(int i=0;i<haystack.length();i++){
            if(haystack[i]==needle[0]){
                flag=1;
                for(int j=1;j<l;j++){
                    if(haystack[i+j]!=needle[j]){
                        flag=0;
                        break;
                    }
                    if(j==l-1){
                        return i;
                    }
                }
                if(flag==1){
                    return i;
                }
            }
            
        }
        return -1;
        
    }
};