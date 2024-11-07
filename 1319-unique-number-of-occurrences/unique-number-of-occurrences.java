class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> cnt = new HashMap<>();
        HashMap<Integer,Integer> occurances = new HashMap<>();

        for(int i:arr){
            if(cnt.containsKey(i)){
                cnt.put(i,cnt.get(i)+1);
            }
            else{
                cnt.put(i,1);
            }
        }
        for(Map.Entry<Integer,Integer> e:cnt.entrySet()){
            if(occurances.containsKey(e.getValue())){
                return false;
            }
            else{
                occurances.put(e.getValue(),1);
            }
        }
        return true;
    }
}