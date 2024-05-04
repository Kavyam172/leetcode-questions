class Solution {
public:
    int compareVersion(string version1, string version2) {
        int v1=0;
        int v2=0;

        while(v1<version1.size() || v2<version2.size()){
            int x1=0;
            int x2=0;
            while(v1<version1.size() && version1[v1]!='.'){
                x1 = (x1*10)+(version1[v1]-'0');
                v1++;
            }
            while(v2<version2.size() && version2[v2]!='.'){
                x2 = (x2*10)+(version2[v2]-'0');
                v2++;
            }
            if(x1==x2){
                v1++;
                v2++;
                x1 = 0;
                x2 = 0;
                continue;
            }
            else if(x1>x2){
                return 1;
            }
            else{
                return -1;
            }
        }
        return 0;
        
    }
};