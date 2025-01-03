class Solution {
    public void dfs(List<List<Integer>> rooms,List<Integer> visited,int node){
        visited.add(node);

        for(int i=0;i<rooms.get(node).size();i++){
            if(!visited.contains(rooms.get(node).get(i))){
                dfs(rooms,visited,rooms.get(node).get(i));
            }
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        List<Integer> visited = new ArrayList<>();
        dfs(rooms,visited,0);
        if(visited.size()==rooms.size()){
            return true;
        }
        return false;
    }
}