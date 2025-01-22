class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int r = isWater.length;
        int c = isWater[0].length;
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(isWater[i][j]==1){
                    q.add(new int[]{i,j});
                    visited[i][j] = true;
                }
            }
        }

        int dis = 0;
        while(!q.isEmpty()){
            int l = q.size();
            for(int i=0;i<l;i++){
                int[] curr = q.poll();

                int x = curr[0];
                int y = curr[1];
                isWater[x][y] = dis;

                if(x+1<r && !visited[x+1][y]){
                    q.add(new int[]{x+1,y} );
                    visited[x+1][y] = true;
                }
                if(x-1>=0 && !visited[x-1][y]){
                    q.add(new int[]{x-1,y});
                    visited[x-1][y] = true;
                }
                if(y+1<c && !visited[x][y+1]){
                    q.add(new int[]{x,y+1});
                    visited[x][y+1] = true;
                }
                if(y-1>=0 && !visited[x][y-1]){
                    q.add(new int[]{x,y-1});
                    visited[x][y-1] = true;
                }
            }
            dis++;
        }

        return isWater;

    }
}