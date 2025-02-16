class Solution {
    private boolean backtrack(int i,int[] res,int n,boolean[] used){
        if(i==res.length){
            return true;
        }

        for(int j=n;j>0;j--){
            if(used[j]){
                continue;
            }
            if(j>1 && (i+j>=res.length || res[i+j]!=0)){
                continue;
            }

            used[j] = true;
            res[i] = j;
            if(j>1){
                res[i+j] = j;
            }
            int temp = i+1;
            while(temp<res.length && res[temp]!=0){
                temp++;
            }
            if(backtrack(temp,res,n,used)){
                return true;
            }
            used[j] = false;
            res[i] = 0;
            if(j>1){
                res[i+j] = 0;
            }
        }
        return false;

    }
    public int[] constructDistancedSequence(int n) {
        int[] res = new int[(2*n)-1];
        boolean[] used = new boolean[n+1];
        backtrack(0,res,n,used);
        return res;
    }
}