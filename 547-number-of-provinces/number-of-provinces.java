class Solution {
    public void dfs(int[][] isConnected,int start,boolean[] visited){
        int cols = isConnected[start].length;

        for(int i=0;i<cols;i++){
            if(isConnected[start][i]==1 && !visited[i]){
                visited[i] = true;
                dfs(isConnected,i,visited);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int rows = isConnected.length;
        int cols = isConnected[0].length;

        int provinces = 0;

        boolean[] visited = new boolean[rows];

        for(int i=0;i<rows;i++){
            if(!visited[i]){
                visited[i] = true;
                dfs(isConnected,i,visited);
                provinces++;
            }
        }
        return provinces;
    }
}