class Solution {
public:
    int minimumPushes(string word) {
        unordered_map<char,int> m;
        for(int i=0;i<word.length();i++){
            m[word[i]]++;
        }
        vector<pair<char,int>> map;
        for(auto iter:m){
            map.push_back({iter.first,iter.second});
        }
        sort(map.begin(),map.end(),[](pair<char,int> a,pair<char,int> b){
            return a.second>b.second;
        });
        int push = 1;
        int total = 0;
        int letters = 1;
        for(int i=0;i<map.size();i++){
            cout<<map[i].first;
            if(letters>8){
                push++;
                letters=1;
            }
            total+=(push)*map[i].second;
            letters++;
        }
        return total;
    }
};