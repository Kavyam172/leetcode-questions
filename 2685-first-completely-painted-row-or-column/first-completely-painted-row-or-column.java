class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        int[] rows = new int[r];
        int[] cols = new int[c];
        int[][] pos = new int[(r*c)+1][2];

        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                pos[mat[i][j]][0] = i;
                pos[mat[i][j]][1] = j;
            }
        }

        for(int i=0;i<arr.length;i++){
            int ele = arr[i];
            int row = pos[ele][0];
            int col = pos[ele][1];
            rows[row]++;
            cols[col]++;
            if(rows[row]==c || cols[col]==r){
                return i;
            }
        }
        return -1;
    }
}