class Solution {
    public int countNegatives(int[][] grid) {
        int cnt = 0;
        int r = grid.length;
        int c = grid[0].length;

        for(int i=0;i<r;i++){
            int low = 0;
            int high = c-1;
            int mid = (low+high)/2;
            int neg = c;

            while(low<=high){
                if(grid[i][mid]>=0){
                    low = mid+1;
                }
                else{
                    neg = mid;
                    high = mid - 1;
                }
                mid = (low+high)/2;
            }


            cnt+= c-neg;

        }

        return cnt;
    }
}