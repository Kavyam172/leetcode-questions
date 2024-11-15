class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        int i=0;
        while(i<asteroids.length){
            if(st.isEmpty()){
                st.push(asteroids[i]);
                i++;
                continue;
            }
            if(asteroids[i]>0){
                st.push(asteroids[i]);
                i++;
            }
            else{
                int top = st.peek();
                if(top>0){
                    if(top<(asteroids[i]*-1) ){
                        st.pop();
                    }
                    else if(top==(asteroids[i]*-1)){
                        st.pop();
                        i++;
                    }
                    else{
                        i++;
                    }
                }
                else{
                    st.push(asteroids[i]);
                    i++;
                }
            }
        }

        int[] ans = new int[st.size()];
        int j=0;
        while(!st.isEmpty()){
            ans[j] = st.pop();
            j++;
        }

        for(int k=0;k<ans.length/2;k++){
            int temp = ans[k];
            ans[k] = ans[ans.length-1-k];
            ans[ans.length-1-k] = temp;
        }
        return ans;
    }
}