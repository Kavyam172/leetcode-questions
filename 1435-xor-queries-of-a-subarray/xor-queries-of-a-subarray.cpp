class Solution {
public:
    vector<int> xorQueries(vector<int>& arr, vector<vector<int>>& queries) {
        vector<int> ans;
        vector<int> pre;
        int x = 0;
        for(int i=0;i<arr.size();i++){
            x^=arr[i];
            pre.push_back(x);
        }

        for(int i=0;i<queries.size();i++){
            if(queries[i][0]==0){
                ans.push_back(pre[queries[i][1]]);
                continue;
            }
            int a = queries[i][0]-1;
            int c = queries[i][1];

            ans.push_back(pre[a]^pre[c]);
        }        
        return ans;
    }
};