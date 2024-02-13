class Solution {
public:
    void swap(int& a,vector<char>& s){
        int l = s.size();
        char temp = s[a];
        s[a] = s[l-a-1];
        s[l-a-1] = temp;
    }
    void reverseString(vector<char>& s) {
        int l=s.size();
        for(int i=0;i<(l/2);i++){
            swap(i,s);
        }
    }
};