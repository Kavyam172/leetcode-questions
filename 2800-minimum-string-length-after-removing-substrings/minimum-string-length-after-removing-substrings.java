class Solution {
    public int minLength(String s) {
        Stack<Character> st = new Stack<>();
        for(char i:s.toCharArray()){
            if(i=='B' && !st.empty() && st.peek()=='A'){
                st.pop();
            }
            else if(i=='D' && !st.empty() && st.peek()=='C'){
               st.pop();
            }
            else{
                st.push(i);
            }
        }
        return st.size();
    }
}