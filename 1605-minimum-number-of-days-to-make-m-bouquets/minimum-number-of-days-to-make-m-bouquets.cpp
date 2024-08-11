class Solution {
public:
    int minDays(vector<int>& bloomDay, int m, int k) {
        long long int flowers = (long long int)m*(long long int)k;
        int n = bloomDay.size();
        if(n<flowers){
            return -1;
        }
        int maxd = bloomDay[0];
        int mind = bloomDay[0];
        for(int i=1;i<n;i++){
            maxd = max(bloomDay[i],maxd);
            mind = min(bloomDay[i],mind);
        }
        int low = mind;
        int high = maxd;
        int ans=-1;
        while(low<=high){
            int mid = (low+high)/2;
            int cnt = 0;
            int b = 0;
            for(int j=0;j<n;j++){
                if(bloomDay[j]<=mid){
                    cnt++;
                }
                else{
                    b+=(cnt/k);
                    cnt = 0;
                }
            }
            b+=(cnt/k);
            if(b >= m){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
};