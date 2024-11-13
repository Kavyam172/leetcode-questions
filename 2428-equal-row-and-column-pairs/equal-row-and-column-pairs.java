class Solution {
    public int equalPairs(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        Map<List<Integer>,Integer> mp = new HashMap<>();
        int cnt = 0;
        for(int i=0;i<cols;i++){
            List<Integer> temp = new ArrayList<>();
            for(int j=0;j<rows;j++){
                temp.add(grid[j][i]);
            }
            if(mp.containsKey(temp)){
                mp.put(temp,mp.get(temp)+1);
            }
            else{
                mp.put(temp,1);
            }
        }

        for(int i=0;i<rows;i++){
            List<Integer> temp = new ArrayList<>();
            for(int j=0;j<cols;j++){
                temp.add(grid[i][j]);
            }
            if(mp.containsKey(temp)){
                cnt+=mp.get(temp);
            }        
        }
        return cnt;
    }
}