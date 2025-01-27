class Solution {
    public Boolean dfs(List<List<Integer>> pre,int src,int target,boolean[] visited){
        if(src==target){
            return true;
        }

        visited[src] = true;
        for(int i:pre.get(src)){
            if(!visited[i]){
                if(dfs(pre,i,target,visited)){
                    return true;
                }
            }   
        }
        return false;
    }
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        List<Boolean> ans = new ArrayList<>();
        List<List<Integer>> pre = new ArrayList<>();

        for(int i=0;i<numCourses;i++){
            pre.add(new ArrayList<>());
        }

        for(int[] i:prerequisites){
            int a = i[0];
            int b = i[1];

            pre.get(a).add(b);
        }

        for(int[] i:queries){
            int a = i[0];
            int b = i[1];
            boolean[] visited = new boolean[numCourses];
            ans.add(dfs(pre,a,b,visited));
        }
        return ans;
    }
}