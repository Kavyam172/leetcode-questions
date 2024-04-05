class Solution {
public:
    string makeGood(string s) {
        stack<char> st;
        string result = "";
        for(int i=0;i<s.length();i++){
            if(st.empty()){
                st.push(s[i]);
                continue;
            }
            if((s[i]==toupper(st.top()) && tolower(s[i])==st.top()) || (toupper(s[i])==st.top() && s[i]==tolower(st.top()))){
                st.pop();
            }
            else{
                st.push(s[i]);
            }
        }
        while(!st.empty()){
            result += st.top();
            st.pop();
        }
        reverse(result.begin(),result.end());
        return result;
    }
};