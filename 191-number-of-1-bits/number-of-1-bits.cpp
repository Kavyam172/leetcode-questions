class Solution {
public:
    int hammingWeight(int n) {
        int count = 0;
        while(n>0){
            int curr = n%2;
            if(curr==1){
                count+=1;
            }
            n=n/2;
        }
        return count;
    }
};