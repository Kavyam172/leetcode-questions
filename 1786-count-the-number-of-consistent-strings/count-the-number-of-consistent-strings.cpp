class Solution {
public:
    int countConsistentStrings(string allowed, vector<string>& words) {
        unordered_map<char,int> m;
        for(int i=0;i<allowed.length();i++){
            m[allowed[i]]++;
        }
        int ans = words.size();

        for(int i=0;i<words.size();i++){
            for(int j=0;j<words[i].length();j++){
                if(m.find(words[i][j])==m.end()){
                    ans--;
                    break;
                }
            }
        }
        return ans;
    }
};