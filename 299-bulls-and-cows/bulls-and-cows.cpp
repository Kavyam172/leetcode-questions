class Solution {
public:
    string getHint(string secret, string guess) {
        int l=guess.length();
        int bulls=0;
        int cows=0;
        unordered_map<char,int> mp_secret;
        unordered_map<char,int> mp_guess;
        for(int i=0;i<l;i++){
            if(guess[i]==secret[i]){
                bulls++;
            }
            else{
                mp_secret[secret[i]]++;
                mp_guess[guess[i]]++;
            }
        }
        for(auto iter:mp_guess){
            cows+=min(iter.second,mp_secret[iter.first]);
        }
        return to_string(bulls)+"A"+to_string(cows)+"B";
    }
};