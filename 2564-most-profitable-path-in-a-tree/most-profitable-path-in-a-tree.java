class Solution {
    private boolean dfs(int src,boolean[] visited,List<List<Integer>> adj, Map<Integer,Integer> b,int time){
        if(src==0){
            b.put(src,time);
            return true;
        }
        visited[src] = true;

        for(int next:adj.get(src)){
            if(!visited[next]){
                if(dfs(next,visited,adj,b,time+1)){
                    b.put(src,time);
                    return true;
                }
            }
        }
        return false;
    }

    private void bobPath(Map<Integer,Integer> b,int src,List<List<Integer>> adj){
        boolean[] visited = new boolean[adj.size()];
        dfs(src,visited,adj,b,0);
    }

    public int mostProfitablePath(int[][] edges, int bob, int[] amount) {
        //Step1: create adj list
        //step2: define bob's path using dfs
        //step3: traverse alice's path using either dfs or bfs

        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<=edges.length;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge:edges){
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        Map<Integer,Integer> b = new HashMap<>();
        bobPath(b,bob,adj);

        int maxm = Integer.MIN_VALUE;

        Queue<int[]> q = new LinkedList<>();
        boolean[] visited_a = new boolean[adj.size()];
        q.add(new int[]{0,0,0});
        visited_a[0] = true;

        while(!q.isEmpty()){
            int[] temp = q.poll();
            int curr = temp[0];
            int inc = temp[1];
            int time = temp[2];

            int newInc = inc;
            if(b.containsKey(curr)){
                System.out.printf("%d %d\n",b.get(curr),time);
                if(b.get(curr)==time){
                    newInc+=(amount[curr]/2);
                }
                else if(b.get(curr)<time){
                    newInc+=0;
                }
                else{
                    newInc+=amount[curr];
                }
            }
            else{
                newInc+=amount[curr];
            }

            if(curr!=0 && adj.get(curr).size()<=1){
                maxm = Math.max(maxm,newInc);
            }

            for(int next:adj.get(curr)){
                if(!visited_a[next]){
                    visited_a[next] = true;
                    q.add(new int[]{next,newInc,time+1});
                }
            }
        }

        return maxm;

    }
}