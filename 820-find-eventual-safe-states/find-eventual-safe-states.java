class Solution {

    // the nodes that do not end up in a cycle are safe nodes. So we need to check for cycles here.
    // we start from one node then visit all its adjacent node to find a cycle.
    // if cycle is found node is unsafe.
    // we keep track of all nodes in 2 aspects. if node is visited and if node is safe.
    // a node that is not safe and is visited means it contains a cycle. 
    public boolean dfs(int[][] graph,boolean[] isSafe, int src, boolean[] visited){
        if(isSafe[src]){
            return true;
        }

        if(visited[src]){
            return false;
        }
        visited[src] = true;

        for(int i:graph[src]){
            if(!dfs(graph,isSafe,i,visited)){
                return false;
            }
        }

        isSafe[src] = true;
        return true;

    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> ans = new ArrayList<>();
        boolean[] isSafe = new boolean[graph.length];
        boolean[] visited = new boolean[graph.length];

        for(int i=0;i<graph.length;i++){
            dfs(graph,isSafe,i,visited);
        }

        for(int i=0;i<isSafe.length;i++){
            if(isSafe[i]){
                ans.add(i);
            }
        }
        return ans;
    }
}