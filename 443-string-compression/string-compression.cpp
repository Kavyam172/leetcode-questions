class Solution {
public:
    int compress(vector<char>& chars) {
        int i=0;
        int j=0;
        int idx = 0;
        while(i<chars.size()){
            while(j<chars.size() && chars[i]==chars[j]){
                j++;
            }
            string cnt = to_string(j-i);
            chars[idx++] = chars[i];
            if(j-i>1){
                for(char ch:cnt){
                    chars[idx++] = ch;
                }
            }
            i=j;
        }
        return idx;
    }
};