class Solution {
    public int sqSum(int n){
        int sum = 0;
        while(n!=0){
            int rem = n%10;
            sum+=(rem*rem);
            n = n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        if(n<0){
            return false;
        }
        int slow = sqSum(n);
        int fast = sqSum(sqSum(n));
        while(slow != 1 && fast!=1){
            slow = sqSum(slow);
            fast = sqSum(sqSum(fast));
            if(slow==fast){
                return false;
            }
        }
        return true;

    }
}