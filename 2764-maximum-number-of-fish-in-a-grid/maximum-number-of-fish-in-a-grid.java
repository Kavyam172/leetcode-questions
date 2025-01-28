class Solution {
    public int dfs(int[][] grid,int i,int j, boolean[][] visited){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || visited[i][j]==true || grid[i][j]==0){
            return 0;
        }

        

        visited[i][j] = true;

        int left = dfs(grid,i,j-1,visited);
        int right = dfs(grid,i,j+1,visited);
        int up = dfs(grid,i-1,j,visited);
        int down = dfs(grid,i+1,j,visited);

        return grid[i][j]+left+right+up+down;

    }
    public int findMaxFish(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;

        int maxm = 0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]>0){
                    boolean[][] visited = new boolean[r][c];
                    maxm = Math.max(maxm,dfs(grid,i,j,visited));
                }
            }
        }
        return maxm;
    }
}