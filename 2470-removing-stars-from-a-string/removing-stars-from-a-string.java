class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*' && !st.isEmpty()){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()){
            char ch = st.pop();
            ans.append(ch);
        }
        return ans.reverse().toString();
    }
}