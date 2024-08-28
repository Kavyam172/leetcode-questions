class Solution {
public:
    bool isItPossible(string word1, string word2) {
        if(word1==word2){
            return true;
        }
        unordered_map<char,int> m1;
        unordered_map<char,int> m2;
        for(int i=0;i<word1.length();i++){
            m1[word1[i]]++;
        }
        for(int i=0;i<word2.length();i++){
            m2[word2[i]]++;
        }

        int d1 = m1.size();
        int d2 = m2.size();

        for(auto iter:m1){
                for(auto iter2:m2){
                    if(iter.first==iter2.first){
                        if(d1==d2){
                            return true;
                        }
                        continue;
                    }
                    if(iter.second==1){
                        d1--;
                    }
                    if(iter2.second==1){
                        d2--;
                    }
                    if(m2.find(iter.first)==m2.end()){
                        d2+=1;
                    }
                    if(m1.find(iter2.first)==m1.end()){
                        d1+=1;
                    }
                    if(d1==d2){
                        return true;
                    }
                    d1 = m1.size();
                    d2 = m2.size();
                }
        }
        return false;
    }
};