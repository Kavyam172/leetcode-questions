class Solution {
    public int orangesRotting(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int time = 0;
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==2){
                    visited[i][j] = true;
                    q.add(new int[]{i,j});
                }
            }
        }

        while(!q.isEmpty()){
            int l = q.size();

            for(int i=0;i<l;i++){
                int[] curr = q.poll();
                int x = curr[0];
                int y = curr[1];

                if(x-1>=0 && !visited[x-1][y] && grid[x-1][y]!=0){
                    grid[x-1][y] = 2;
                    q.add(new int[]{x-1,y});
                    visited[x-1][y] = true;
                }
                if(x+1<r && !visited[x+1][y] && grid[x+1][y]!=0){
                    grid[x+1][y] = 2;
                    q.add(new int[]{x+1,y});
                    visited[x+1][y] = true;
                }
                if(y-1>=0 && !visited[x][y-1] && grid[x][y-1]!=0){
                    grid[x][y-1] = 2;
                    q.add(new int[]{x,y-1});
                    visited[x][y-1] = true;
                }
                if(y+1<c && !visited[x][y+1] && grid[x][y+1]!=0){
                    grid[x][y+1] = 2;
                    q.add(new int[]{x,y+1});
                    visited[x][y+1] = true;
                }
            }
            time++;
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }

        return Math.max(0,time-1);
    }
}