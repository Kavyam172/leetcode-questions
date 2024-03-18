class Solution {
public:
    int maxWidthOfVerticalArea(vector<vector<int>>& points) {
        int rows = points.size();
        vector<int> v;
        int result = 0;
        for(int i=0;i<rows;i++){
            v.push_back(points[i][0]);
        }
        sort(v.begin(),v.end());
        for(int i=0;i<v.size()-1;i++){
            if(v[i+1]-v[i]>result){
                result = v[i+1]-v[i];
            }
        }
        return result;
    }
};