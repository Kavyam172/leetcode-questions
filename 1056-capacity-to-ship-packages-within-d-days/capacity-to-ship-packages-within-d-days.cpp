class Solution {
public:
    int shipWithinDays(vector<int>& weights, int days) {
        int maxm = weights[0];
        int total = 0;
        int ans = 0;
        for(int i=0;i<weights.size();i++){
            maxm = max(weights[i],maxm);
            total += weights[i];
        }

        int low = maxm;
        int high = total;

        while(low<=high){
            int mid = (low+high)/2;
            int sum =0;
            int d =0;
            for(int j=0;j<weights.size();j++){
                sum+=weights[j];
                if(sum>mid){
                    d++;
                    sum=weights[j];
                }
            }
            d++;
            if(d<=days){
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