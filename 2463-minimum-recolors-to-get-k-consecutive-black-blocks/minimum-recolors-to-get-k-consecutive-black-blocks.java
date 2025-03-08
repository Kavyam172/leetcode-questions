class Solution {
    public int minimumRecolors(String blocks, int k) {
        int l=0;
        int r = l+k;

        int white = 0;
        int black = 0;

        char[] bl = blocks.toCharArray();

        for(int i=l;i<r;i++){
            if(bl[i]=='W'){
                white++;
            }
            else{
                black++;
            }
        }

        int ans = white;

        while(r<bl.length){
            if(bl[r]=='W'){
                white++;
            }
            else{
                black++;
            }
            r++;

            if(bl[l]=='W'){
                white--;
            }
            else{
                black--;
            }
            l++;

            ans = Math.min(ans,white);
        }

        return ans;

    }
}