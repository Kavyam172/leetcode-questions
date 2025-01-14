class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int rows = maze.length;
        int cols = maze[0].length;
        Queue<Pair<int[],Integer>> q = new LinkedList<>();
        q.add(new Pair(entrance,0));

        int[][] visited = new int[rows][cols];
        visited[entrance[0]][entrance[1]] = 1;

        while(!q.isEmpty()){
                Pair<int[],Integer> curr= q.poll();
                int[] loc = curr.getKey();
                Integer dis = curr.getValue();



                

                if((loc[0]==0 || loc[0]==rows-1 || loc[1]==0 || loc[1]==cols-1) && dis!=0){
                    System.out.printf("%d %d",loc[0],loc[1]);
                    return dis;
                }

                if(loc[0]-1>=0 && visited[loc[0]-1][loc[1]]==0 && maze[loc[0]-1][loc[1]]=='.'){
                    q.add(new Pair(new int[]{loc[0]-1,loc[1]},dis+1));
                    visited[loc[0]-1][loc[1]] = 1;
                }
                if(loc[0]+1<rows && visited[loc[0]+1][loc[1]]==0 && maze[loc[0]+1][loc[1]]=='.'){
                    q.add(new Pair(new int[]{loc[0]+1,loc[1]},dis+1));
                    visited[loc[0]+1][loc[1]] = 1;
                }
                if(loc[1]-1>=0 && visited[loc[0]][loc[1]-1]==0 && maze[loc[0]][loc[1]-1]=='.'){
                    q.add(new Pair(new int[]{loc[0],loc[1]-1},dis+1));
                    visited[loc[0]][loc[1]-1] = 1;
                }
                if(loc[1]+1<cols && visited[loc[0]][loc[1]+1]==0 && maze[loc[0]][loc[1]+1]=='.'){
                    q.add(new Pair(new int[]{loc[0],loc[1]+1},dis+1));
                    visited[loc[0]][loc[1]+1] = 1;
                }

            
        }
        return -1;
    }
}