class Solution {
public:
    void check(vector<int>& digits,int n){

        if(digits[n]==9){
            if(n==0){
                digits[n]=1;
                digits.push_back(0);
            }
            else{
                digits[n]=0;
                check(digits,n-1);
            }
        }
        else if(digits[n]<9){
            digits[n]+=1;
        }


    }
    vector<int> plusOne(vector<int>& digits) {
        int l = digits.size();
        
        check(digits,l-1);
        return digits;
    }
};