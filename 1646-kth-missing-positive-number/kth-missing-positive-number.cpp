class Solution {
public:
    int findKthPositive(vector<int>& arr, int k) {
        int missing =0;
        int maxm = arr[0];
        for(int i=0;i<arr.size();i++){
            maxm = max(maxm,arr[i]);
        }

        if(maxm-arr.size()==0){
            return maxm+k;
        }
        else if(maxm-arr.size()<k){
            return maxm+(k-(maxm-arr.size()));
        }
        
        int i=1;
        while(i<maxm){
            for(int j=0;j<arr.size();j++){
                if(arr[j]==i){
                    break;
                }
                else if(arr[j]>i){
                    missing++;
                    break;
                }
            }
            if(missing==k){
                return i;
            }
            i++;
        }
        return -1;
    }
};