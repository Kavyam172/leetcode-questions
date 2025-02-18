class Solution {
    public String smallestNumber(String pattern) {
        String ans = "";
        Stack<Integer> st = new Stack<>();
        int num = 1;
        st.push(num);
        num++;
        for(int i=0;i<pattern.length();i++){
            Stack<Integer> temp = new Stack<>();
            if(pattern.charAt(i) == 'I'){
                while(!st.isEmpty()){
                    temp.push(st.pop());
                }
                st.push(num);
                while(!temp.isEmpty()){
                    st.push(temp.pop());
                }
            }
            else{
                while(st.peek()!=num-1){
                    temp.push(st.pop());
                }
                st.push(num);
                while(!temp.isEmpty()){
                    st.push(temp.pop());
                }
            }
            num++;
        }



        while(!st.isEmpty()){
            ans+=st.pop();
        }
        return ans;
    }
}