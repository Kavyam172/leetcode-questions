class Solution {
    public long coloredCells(int n) {
        long start = 1;
        long diff = 4;
        for(int i=1;i<n;i++){
            start+=diff;
            diff+=4;
        }
        return start;
    }
}