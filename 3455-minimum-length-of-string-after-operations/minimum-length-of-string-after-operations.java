class Solution {
    public int minimumLength(String s) {
        int[] freq = new int[26];
        char[] str = s.toCharArray();
        for(int i=0;i<str.length;i++){
            char c = str[i];
            freq[c-'a']++;
        }
        int l = s.length();

        int[] mp = new int[26];

        for(int i=0;i<str.length;i++){
            if(str[i]==' '){
                continue;
            }
            char c = str[i];
            int total = freq[c-'a'];
            if(mp[c-'a']>0 && total-mp[c-'a']-1>0){
                int j = i-1;
                while(j>0){
                    if(str[j]==c){
                        str[j] = ' ';
                        freq[c-'a']--;
                        mp[c-'a']--;
                        break;
                    }
                    j--;
                }
                j=i+1;
                while(j<str.length){
                    if(str[j]==c){
                        str[j] = ' ';
                        freq[c-'a']--;
                        break;
                    }
                    j++;
                }
                l-=2;
            }
            mp[c-'a']++;
        }
        return l;

        
    }
}