class Solution {
    public int countOdds(int low, int high) {
        int cnt = 0;
        int firstOdd = -1;
        if(low%2==0){
            firstOdd=low+1;
        }
        else{
            firstOdd=low;
        }
        for(int i=firstOdd;i<=high;i+=2){
            cnt++;
        }
        return cnt;
    }
}