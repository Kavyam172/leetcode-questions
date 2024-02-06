class Solution {
public:
    int reverse(int x) {
        unsigned int temp;
        int new_x=0;
        int flag=0;
        if(x<0){
            temp = (unsigned int)x*-1;
            flag=1;
        }
        else{
            temp=x;
        }
            while(temp>0){
                int n;
                n=temp%10;
                cout << n;
                if(new_x>(pow(2,31))/10 || (new_x==(pow(2,31))/10 && n>7))
                {
                    return 0;
                }
                new_x=(new_x*10)+n;
                temp/=10;
            }
            if(flag){
                return new_x*-1;
            }
            return new_x;
    }
};