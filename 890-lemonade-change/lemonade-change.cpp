class Solution {
public:
    bool lemonadeChange(vector<int>& bills) {
        int fives = 0,tens = 0,twenty = 0;
        for(int i=0;i<bills.size();i++){
            if(bills[i]==5){
                fives++;
            }
            else if(bills[i]==10){
                if(fives==0){
                    return false;
                }
                tens++;
                fives--;
            }
            else{
                if((tens>0 && fives==0) || (tens==0 && fives<3)){
                    return false;
                }
                twenty++;
                if(tens>0 && fives>0){
                    tens--;
                    fives--;
                }
                else if(tens==0 && fives>=3){
                    fives-=3;
                }
            }
        }
        return true;
    }
};