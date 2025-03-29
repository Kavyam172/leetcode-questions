class Solution {
    public int minCut(String s) {
        int n = s.length();
        char[] c = s.toCharArray();
        int min = 0;

        int[] cut = new int[n];

        boolean[][] pal = new boolean[n][n];

        for(int i=0;i<n;i++){
            min = i;
            for(int j=0;j<=i;j++){
                if(c[j]==c[i] && (j+1>i-1 || pal[j+1][i-1])){
                    pal[j][i] = true;
                    if(j==0){
                        min = 0;
                    }
                    else{
                        min = Math.min(min,cut[j-1]+1);
                    }
                    cut[i] = min;
                }
            }


        }
        return cut[n-1];
    }
}