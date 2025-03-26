class Solution {
    public int minOperations(int[][] grid, int x) {
        // step 1: check all remainders to see if solution is possible. if remainders are same , it is possible.
        // step 2: convert grid to 1D array.
        // step 3: prefix sum / suffix sum

        int m = grid.length;
        int n = grid[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]%x != grid[0][0]%x){
                    return -1;
                }
            }
        }

        int[] arr = new int[m*n];

        int idx = 0;
        int total = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[idx] = grid[i][j];
                total += grid[i][j];
                idx++;
            }
        }

        Arrays.sort(arr);

        int prefix = 0;

        int res = Integer.MAX_VALUE;

        for(int i = 0;i<n*m;i++){
            int left = (arr[i] *i) - prefix; 
            int right = total - prefix - (arr[i] * (arr.length-i));
            int curr=left/x;
            curr+=right/x;

            res = Math.min(res,curr);
            prefix+=arr[i];
        }

        return res;




    }
}