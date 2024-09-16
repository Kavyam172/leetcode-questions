class Solution {
public:
    int findMinDifference(vector<string>& timePoints) {
        vector<int> minutes(timePoints.size());
        for(int i=0;i<timePoints.size();i++){
            int hrs = ((timePoints[i][0]-'0')*10)+(timePoints[i][1]-'0');
            // cout<<hrs<<endl;
            int min = ((timePoints[i][3]-'0')*10)+(timePoints[i][4]-'0');
            int total = (hrs*60)+min;
            // cout<<total<<endl;
            minutes[i] = total;
        }
        sort(minutes.begin(),minutes.end());
        int mindiff = INT_MAX;
        for(int i=0;i<minutes.size();i++){
            for(int j=i+1;j<minutes.size();j++){
                int diff = minutes[j]-minutes[i];
                if(diff>720){
                    diff = 1440-diff;
                }
                if(diff == 0){
                    return diff;
                }
                if(diff<mindiff){
                    mindiff = diff;
                }

            }
        }
        return mindiff;
    }
};