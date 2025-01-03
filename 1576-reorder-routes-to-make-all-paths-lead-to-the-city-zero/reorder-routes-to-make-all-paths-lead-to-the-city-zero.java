class Solution {
    public int dfs(int start,List<List<int[]>> graph,boolean[] visited){
        visited[start] = true;

        int cnt = 0;

        for(int[] i:graph.get(start)){
            int next = i[0];
            int dir = i[1];

            if(!visited[next]){
                cnt+=dir;
                cnt+=dfs(next,graph,visited);
            }
        }

        return cnt;
    }
    public int minReorder(int n, int[][] connections) {
        List<List<int[]>> graph = new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }

        for(int[] con:connections){
            int from = con[0];
            int to = con[1];
            graph.get(from).add(new int[]{to,1});
            graph.get(to).add(new int[]{from,0});
        }

        boolean[] visited = new boolean[graph.size()];

        return dfs(0,graph,visited);
    }
}