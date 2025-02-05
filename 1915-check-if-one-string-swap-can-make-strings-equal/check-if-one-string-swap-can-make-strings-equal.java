class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int[] hash = new int[26];
        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            hash[ch-'a']++;
        }

        for(int i=0;i<s1.length();i++){
            char ch = s2.charAt(i);
            hash[ch-'a']--;
        }

        for(int i=0;i<26;i++){
            if(hash[i]!=0){
                return false;
            }
        }

        int cnt = 0;

        for(int i=0;i<s1.length();i++){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            if(ch1!=ch2){
                cnt++;
            }
        }

        return cnt<=2;

    }
}