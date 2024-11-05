class Solution {
    public int largestAltitude(int[] gain) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0;i<gain.length;i++){
            if(sum>max){
                max = sum;
            }
            sum+=gain[i];
        }
        if(sum>max){
            return sum;
        }
        return max;

    }
}