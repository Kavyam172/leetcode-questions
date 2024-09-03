class Solution {
public:
    int digitSum(int num){
        int sum = 0;
        while(num>0){
            int rem = num%10;
            num/=10;
            sum+=rem;
        }
        return sum;
    }
    int getLucky(string s, int k) {
        int converted = 0;
        for(int i=0;i<s.length();i++){
            int num = int(s[i])-97+1;
            converted+=digitSum(num);
        }

        while(k-1>0){
            converted = digitSum(converted);
            k--;
        }
        return converted;

    }
};