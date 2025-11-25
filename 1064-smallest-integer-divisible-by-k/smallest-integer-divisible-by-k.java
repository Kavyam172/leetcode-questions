class Solution {
    public int smallestRepunitDivByK(int k) {
        int n=1;
        for(int i=0;i<k;i++){
            int rem=n%k;
            if(rem==0){
                return i+1;
            }
            n = rem*10+1;
        }
        return -1;


    }
}