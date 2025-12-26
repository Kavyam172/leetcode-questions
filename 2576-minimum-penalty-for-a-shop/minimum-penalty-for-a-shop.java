class Solution {
    public int bestClosingTime(String customers) {
        int n = customers.length();

        int totalY = 0;
        int leftN = 0;
        int minm = Integer.MAX_VALUE;
        int idx = -1;

        for(int i=0;i<n;i++){
            char ch = customers.charAt(i);
            if(ch=='Y'){
                totalY++;
            }
        }

        for(int i=0;i<=n;i++){
            int penalty = leftN + totalY;
            if(penalty<minm){
                minm = penalty;
                idx = i;
            }
            if(i>=n){
                break;
            }
            char ch = customers.charAt(i);
            if(ch=='N'){
                leftN++;
            }
            else{
                totalY--;
            }
        }

        return idx;
    }
}