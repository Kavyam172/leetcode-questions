class Solution {
public:
    vector<vector<int>> generate(int n) {
        vector<vector<int>> res;
        vector<int> curr;
        int r = 0;
        while(r<n){
            int i=0,j=1,k=0;
            while(k<=r){
                if(k==0 || k==r){
                    curr.push_back(1);
                    k++;
                }
                else{
                    curr.push_back(res[r-1][i]+res[r-1][j]);
                    i++;
                    j++;
                    k++;
                }
            }
            res.push_back(curr);
            curr.clear();
            r++;
        }

        return res;
    }
};