class Solution {
    public int takeCharacters(String s, int k) {
        int a = 0;
        int b = 0;
        int c = 0;
        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            if(curr=='a'){
                a++;
            }
            else if(curr=='b'){
                b++;
            }
            else{
                c++;
            }
        }
        if(a<k || b<k || c<k){
            return -1;
        }

        int left = 0;
        int right = 0;
        int ans = 0;
        char[] str = s.toCharArray();
        while(right<s.length()){
            if(str[right]=='a'){
                a--;
            }
            else if(str[right]=='b'){
                b--;
            }
            else{
                c--;
            }
            while((a<k || b<k || c<k) && left <= right){
                if(str[left]=='a'){
                    a++;
                }
                else if(str[left]=='b'){
                    b++;
                }
                else{
                    c++;
                }
                left++;
            }
            ans = Math.max(right-left+1,ans);
            right++;
        }
        return s.length()-ans;
    }
}