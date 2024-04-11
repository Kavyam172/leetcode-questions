class Solution {
public:
    string removeKdigits(string num, int k) {
        string result="";
        stack<char> st;
        int n=0,i=1;
        st.push(num[0]);
        while(i<num.size()){
            if(st.empty()){
                st.push(num[i]);
                i++;
            }
            if(num[i]>st.top()){
                st.push(num[i]);
            }
            else if(num[i]<st.top()){
                st.pop();
                n++;
                if(n==k){
                    break;
                }
                continue;
            }
            else{
                st.push(num[i]);
            }
            i++; 
        }

        while(!st.empty() && n<k){
            st.pop();
            n++;
        }

        while(i<num.size()){
            st.push(num[i]);
            i++;
        }

        while(!st.empty()){
            result+=st.top();
            st.pop();
        }

        reverse(result.begin(),result.end());

        while(result[0]=='0'){
            result.erase(0,1);
        }

        if(result==""){
            return "0";
        }
        
        return result;
    }
};