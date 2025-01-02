class Solution {
    public boolean isVowel(char a){
        if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u'){
            return true;
        }
        return false;
    }
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] ans = new int[queries.length];
        Map<Integer,Integer> mp = new HashMap<>();
        int cnt = 0;
        for(int i=0;i<words.length;i++){
            char first = words[i].charAt(0);
            char last = words[i].charAt(words[i].length()-1);
            if(isVowel(first) && isVowel(last)){
                cnt++;
            }

            mp.put(i,cnt);
        }

        int j=0;
        for(int[] i:queries){
            int start = i[0];
            int end = i[1];

            int startCount = mp.getOrDefault(start-1,0);
            int endCount = mp.getOrDefault(end,0);

            ans[j] = endCount-startCount;
            j++;
        }

        return ans;
    }
}