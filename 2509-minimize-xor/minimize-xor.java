class Solution {
    public int countSetBits(int n){
        int cnt = 0;
        while(n>0){
            n = n&(n-1);
            cnt++;
        }
        return cnt;
    }
    public int minimizeXor(int num1, int num2) {
        int setbits = countSetBits(num2);

        int ans = 0;
        if(setbits==0){
            return 0;
        }

        for(int i=31;i>=0 && setbits>0;i--){
            if((num1 & (1<<i))!=0){
                ans|=(1<<i);
                setbits--;
                if(setbits==0){
                    break;
                }
            }
        }

        for(int i=0;i<32 && setbits>0;i++){
            if((ans & (1<<i))==0){
                ans|=(1<<i);
                setbits--;
                if(setbits==0){
                    break;
                }
            }
        }

        return ans;
    }
}