class Solution {
public:
    void nextPermutation(vector<int>& arr) {
        int n = arr.size() - 1;
        int num = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                num = i;
                break;
            }
        }
        int min = INT_MAX;
        int idx;
        if(num!=-1){
            for (int i = n; i > num; i--) {
                if(arr[i]>arr[num] && arr[i]<min){
                    min = arr[i];
                    idx = i;
                }
            }
            arr[num] = arr[num]+arr[idx];
            arr[idx] = arr[num]-arr[idx];
            arr[num] = arr[num]-arr[idx];
            for(int i=num+1;i<=num+(n-num)/2;i++){
                arr[i] = arr[i]+arr[n-i+(num+1)];
                arr[n-i+(num+1)] = arr[i]-arr[n-i+(num+1)];
                arr[i] = arr[i]-arr[n-i+(num+1)];
            }
        }
        else{
            for(int i=0;i<(n+1)/2;i++){
                arr[i] = arr[i]+arr[n-i];
                arr[n-i] = arr[i]-arr[n-i];
                arr[i] = arr[i]-arr[n-i];
            }
        }


    }
};