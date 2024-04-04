class Solution {
public:
    int maxDepth(string s) {
        stack<int> st;
        int max = 0;
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s[i]=='('){
                st.push(s[i]);
                count++;
            }
            else if(s[i]==')'){
                if(count>max){
                    max = count;
                }
                st.pop();
                count--;
            }
        }
        return max;

    }
};