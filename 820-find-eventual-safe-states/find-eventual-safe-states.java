class Solution {
    public boolean dfs(int[][] graph,List<Integer> ans, int src, boolean[] visited){
        if(ans.contains(src)){
            return true;
        }

        if(visited[src]){
            return false;
        }
        visited[src] = true;

        for(int i:graph[src]){
            if(!dfs(graph,ans,i,visited)){
                return false;
            }
        }

        ans.add(src);
        return true;

    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> ans = new ArrayList<>();
        boolean[] visited = new boolean[graph.length];

        for(int i=0;i<graph.length;i++){
            dfs(graph,ans,i,visited);
        }

        Collections.sort(ans);
        return ans;
    }
}