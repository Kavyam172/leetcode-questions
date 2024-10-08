class Solution {
    private double power(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        double half = power(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }

    public double myPow(double x, int n) {
        if(n==0){
            return 1.0;
        }
        if(n==1){
            return x;
        }
        if(n<0){
            x = 1/x;
            n = n*-1;
        }
            
     return power(x , n);
    }
}