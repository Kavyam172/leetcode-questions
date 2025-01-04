class Solution {
    public double dfs(String start,String end,Map<String, List<Pair<String,Double>>> adj,Map<String,Boolean> visited){

        if(adj.get(start)==null || adj.get(end)==null){
            return -1.0;
        }

        if(start.equals(end)){
            return 1.0;
        }

        visited.put(start,true);

        List<Pair<String,Double>> li = adj.get(start);
        for(int i=0;i<li.size();i++){
            Pair<String,Double> p = li.get(i);

            String next = p.getKey();
            Double val = p.getValue();

            if(!visited.getOrDefault(next,false)){
                double ans = val*dfs(next,end,adj,visited);
                if(ans>0){
                    return ans;
                }
            }

        }
        return -1;
    }
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, List<Pair<String,Double>>> adj = new HashMap<>();
        double[] ans = new double[queries.size()];
        for(int i=0;i<equations.size();i++){
            String first = equations.get(i).get(0);
            String second = equations.get(i).get(1);

            List<Pair<String,Double>> li = adj.getOrDefault(first,new ArrayList<>());
            li.add(new Pair(second,values[i]));
            adj.put(first,li);
            
            List<Pair<String,Double>> li2 = adj.getOrDefault(second,new ArrayList<>());
            li2.add(new Pair(first,1/values[i]));
            adj.put(second,li2);
        }

        for(int i=0;i<queries.size();i++){
            String start = queries.get(i).get(0);
            String end = queries.get(i).get(1);
            Map<String,Boolean> visited = new HashMap<>();

            ans[i] = dfs(start,end,adj,visited);
        }

        return ans;
    }
}