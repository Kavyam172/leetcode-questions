class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
        int cnt = 0;

        int[] minRow = new int[n+1];
        int[] maxRow = new int[n+1];
        int[] minCol = new int[n+1];
        int[] maxCol = new int[n+1];


        Arrays.fill(minRow,n+1);
        Arrays.fill(minCol,n+1);

        for(int[] i:buildings){
            int x = i[0];
            int y = i[1];

            minRow[y] = Math.min(minRow[y],x);
            maxRow[y] = Math.max(maxRow[y],x);
            minCol[x] = Math.min(minCol[x],y);
            maxCol[x] = Math.max(maxCol[x],y);
        }

        for(int[] i:buildings){
            int x = i[0];
            int y = i[1];

            if(minRow[y]<x && maxRow[y]>x && minCol[x]<y && maxCol[x]>y){
                cnt++;
            }
        }

        return cnt;

    }
}