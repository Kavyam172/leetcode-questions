class Solution {
    public int numberOfWays(String corridor) {
        int seats = 0;
        int mod = 1000000007;
        char[] corr = corridor.toCharArray();

        for(char c:corr){
            if(c=='S'){
                seats++;
            }
        }

        if(seats%2==1 || seats==0){
            return 0;
        }

        int seatsFound = 0;
        int ways = 1;
        int i=0;
        while(i<corr.length){
            if(corr[i]=='S'){
                seatsFound++;
            }
            if(seatsFound==2){
                int partitionWays = 1;
                i++;
                while(i<corr.length && corr[i]=='P'){
                    partitionWays++;
                    i++;
                }
                if(i>=corr.length){
                    continue;
                }
                ways = (int)(((long)ways * partitionWays)%mod);
                seatsFound = 0;
                continue;
            }
            i++;
        }

        return ways;
    }
}