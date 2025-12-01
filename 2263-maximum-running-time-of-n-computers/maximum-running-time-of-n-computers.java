class Solution {
    public long maxRunTime(int n, int[] batteries) {
        Arrays.sort(batteries);
        int[] live = new int[n];
        int j=0;
        for(int i=batteries.length-n;i<batteries.length;i++){
            live[j] = batteries[i];
            j++;
        }

        long extra = 0;
        for(int i=0;i<batteries.length-n;i++){
            extra+=batteries[i];
        }

        for(int i=0;i<live.length-1;i++){
            if(extra<((long)(i+1)*(live[i+1]-live[i]))){
                return live[i] + extra/(i+1);
            }
            extra -= (long)(i+1) * (live[i+1] - live[i]);

            live[i] += extra/(i+1);

        }

        return live[n-1] + extra/n;


    }
}