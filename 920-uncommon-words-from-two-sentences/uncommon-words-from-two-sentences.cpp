class Solution {
public:
    vector<string> uncommonFromSentences(string s1, string s2) {
        unordered_map<string,int> m1;
        unordered_map<string,int> m2;
        string word = "";
        vector<string> ans;
        for(int i=0;i<s1.length();i++){
            if(s1[i]==' '){
                m1[word]++;
                word = "";
                continue;

            }
            word+=s1[i];
        }
        m1[word]++;
        word = "";
        for(int i=0;i<s2.length();i++){
            if(s2[i]==' '){
                m2[word]++;
                word = "";
                continue;
            }
            word+=s2[i];
        }
        m2[word]++;

        for(auto iter:m1){
            if(iter.second == 1 && m2.find(iter.first)==m2.end()){
                ans.push_back(iter.first);
            }
        }

        for(auto iter:m2){
            if(iter.second == 1 && m1.find(iter.first)==m1.end()){
                ans.push_back(iter.first);
            }
        }
        return ans;
    }
};