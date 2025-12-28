class Solution {
    public int countNegatives(int[][] grid) {
        int cnt = 0;
        int r = grid.length;
        int c = grid[0].length;

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]<0){
                    cnt++;
                }
            }
        }

        return cnt;
    }
}