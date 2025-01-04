class Solution {
    public int countPalindromicSubsequence(String s) {
        Map<Character, int[]> pos = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (!pos.containsKey(c)) {
                pos.put(c, new int[] { i, i });
            } else {
                int[] val = pos.get(c);
                val[1] = i;
            }
        }

        int res = 0;
        for (Map.Entry<Character, int[]> entry : pos.entrySet()) {
            int[] val = entry.getValue();
            Set<Character> occur = new HashSet<>();
            for (int i = val[0] + 1; i < val[1]; i++) {
                occur.add(s.charAt(i));
            }
            res += occur.size();
        }

        return res;
    }
}