class Solution {
public:
    bool canBeEqual(vector<int>& target, vector<int>& arr) {
        map<int,int> m;
        int t = target.size();
        int a = arr.size();
        for(int i=0;i<t;i++){
            m[target[i]]++;
        }
        for(int i=0;i<a;i++){
            m[arr[i]]--;
        }
        for(auto iter:m){
            if(iter.second!=0){
                return false;
            }
        }
        return true;
    }
};