class Solution {
    public long getDescentPeriods(int[] prices) {
        long[] periods = new long[prices.length];
        for(int i=0;i<prices.length;i++){
            if(i-1>=0 && prices[i-1]-prices[i]==1){
                periods[i] = periods[i-1]+1;
            }
            else{
                periods[i] = 1;
            }
        }

        long sum = 0;
        for(long i:periods){
            sum+=i;
        }

        return sum;
    }
}