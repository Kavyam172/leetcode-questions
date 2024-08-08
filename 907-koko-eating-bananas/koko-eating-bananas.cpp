class Solution {
public:
    double hours(vector<int>& piles,int speed){
        double totalH = 0;
        for(int i=0;i<piles.size();i++){
            totalH+=ceil((double)piles[i]/(double)speed);
            // cout<<totalH;
        }
        return totalH;
    }
    int minEatingSpeed(vector<int>& piles, int h) {
        int maxn = piles[0];
        for(int i=1;i<piles.size();i++){
            if(piles[i]>maxn){
                maxn = piles[i];
            }
        }

        int low = 1;
        int high = maxn;
        while(low<=high){
            int mid = (low+high)/2;
            double hrs = hours(piles,mid);
            if(hrs<=h){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
};