class Solution {
    public int countTriples(int n) {
        int cnt = 0;

        for(int i=3;i<=n;i++){
            int c = i*i;
            for(int j = 1;j<i;j++){
                int a = j*j;
                for(int k = 1;k<i;k++){
                    int b = k*k;

                    if(j!=k && (a+b==c)){
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}