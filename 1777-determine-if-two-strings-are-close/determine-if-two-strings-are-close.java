class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()){
            return false;
        }
        Map<Character,Integer> m1 = new HashMap<>();
        Map<Character,Integer> m2 = new HashMap<>();

        Map<Integer,Integer> freq1 = new HashMap<>();
        Map<Integer,Integer> freq2 = new HashMap<>();

        for(int i=0;i<word1.length();i++){
            char ch = word1.charAt(i);
            if(m1.containsKey(ch)){
                m1.put(ch,m1.get(ch)+1);
            }
            else{
                m1.put(ch,1);
            }
        }

        for(int i=0;i<word2.length();i++){
            char ch2 = word2.charAt(i);
            if(!m1.containsKey(ch2)){
                return false;
            }
            if(m2.containsKey(ch2)){
                m2.put(ch2,m2.get(ch2)+1);
            }
            else{
                m2.put(ch2,1);
            }
        }

        for(Map.Entry<Character,Integer> item:m1.entrySet()){
            int val = item.getValue();
            if(freq1.containsKey(val)){
                freq1.put(val,freq1.get(val)+1);
            }
            else{
                freq1.put(val,1);
            }
        }
        for(Map.Entry<Character,Integer> item:m2.entrySet()){
            int val = item.getValue();
            if(freq2.containsKey(val)){
                freq2.put(val,freq2.get(val)+1);
            }
            else{
                freq2.put(val,1);
            }
        }

        for(Map.Entry<Integer,Integer> item:freq1.entrySet()){
            int val = item.getKey();
            if(freq2.get(val)!=item.getValue()){
                return false;
            }
        
        }
        return true;

    }
}