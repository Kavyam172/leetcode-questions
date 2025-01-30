class Solution {
    public HashSet<Integer> getNodes(List<List<Integer>> adj,int src,boolean[] visited){

        HashSet<Integer> nodes = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();

        q.add(src);
        nodes.add(src);

        while(!q.isEmpty()){
            int curr = q.poll();

            for(Integer next:adj.get(curr)){
                if(nodes.add(next)){
                    q.add(next);
                    visited[next] = true;
                }
            }
        }

        return nodes;

    }

    public int longestPath(List<List<Integer>> adj,int src,boolean[] visited){
        Queue<Pair<Integer,Integer>> q = new LinkedList<>();
        Map<Integer,Integer> visit = new HashMap<>();

        q.add(new Pair(src,1));
        visit.put(src,1);

        


        while(!q.isEmpty()){
            Pair<Integer,Integer> curr = q.poll();
            int val = curr.getKey();
            int dis = curr.getValue();

            for(Integer next:adj.get(val)){
                if(!visit.containsKey(next)){
                    q.add(new Pair(next,dis+1));
                    visit.put(next,dis+1);
                }
                else{
                    if(visit.get(next)==dis){
                        return -1;
                    }
                }
            }
        }

        int len = 0;
        for(Integer value:visit.values()){
            len = Math.max(len,value);
        }

        return len;

    }
    public int magnificentSets(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();

        for(int i=0;i<n+1;i++){
            adj.add(new ArrayList<>());

        }

        for(int[] i:edges){
            int u = i[0];
            int v = i[1];

            adj.get(u).add(v);
            adj.get(v).add(u);

        }

        boolean[] visited = new boolean[n+1];

        int total = 0;

        for(int i=1;i<n+1;i++){
            if(!visited[i]){
                visited[i] = true;

                HashSet<Integer> nodes = getNodes(adj,i,visited);

                int maxm = 0;
                for(Integer node:nodes){
                    int grps = longestPath(adj,node,visited);
                    if(grps == -1){
                        return -1;
                    }

                    maxm = Math.max(maxm,grps);
                }

                total+=maxm;
            }
        }
        return total;
    }
}