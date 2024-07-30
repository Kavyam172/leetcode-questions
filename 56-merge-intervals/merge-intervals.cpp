class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        vector<vector<int>> res;
        int n = intervals.size();
        sort(intervals.begin(),intervals.end(),[](const vector<int>& a,const vector<int>& b){
            return a[0]<b[0];
        });
        int prevStart = intervals[0][0];
        int prevEnd = intervals[0][1];
        res.push_back(intervals[0]);
        for(int i=0;i<n;i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            if(start<=prevEnd){
                res.pop_back();
                res.push_back({min(prevStart,start),max(prevEnd,end)});
                prevStart = min(prevStart,start);
                prevEnd = max(prevEnd,end);
            }
            else{
                res.push_back({start,end});
                prevStart = start;
                prevEnd = end;
            }
        }
        return res;
    }
};