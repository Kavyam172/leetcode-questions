class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> ans = new ArrayList<>();
        int[] freq = new int[26];
        for(String str:words2){
            int[] each = new int[26];
            for(int i=0;i<str.length();i++){
                char c = str.charAt(i);
                each[c-'a']++;
                freq[c-'a'] = Math.max(freq[c-'a'],each[c-'a']);
            }
        }

        for(String str:words1){
            int[] freq2 = new int[26];
            Arrays.fill(freq2,0);
            for(int i=0;i<str.length();i++){
                char c = str.charAt(i);
                freq2[c-'a']++;
            }
            boolean flag = true;
            for(int i=0;i<26;i++){
                if(freq[i]>freq2[i]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                ans.add(str);
            }
        }

        return ans;
    }
}