class Solution {
    public int minAddToMakeValid(String s) {
        char[] p = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(p[i]=='('){
                st.push(p[i]);
            }
            else{
                if(!st.empty() && st.peek()=='('){
                    st.pop();
                }
                else{
                    st.push(p[i]);
                }
            }
        }
        return st.size();
    }
}