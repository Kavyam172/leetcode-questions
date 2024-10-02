class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer,Integer> mp= new TreeMap<>();
        for(int i=0;i<arr.length;i++){
            mp.put(arr[i],i);
        }
        int i=1;
        for(Map.Entry<Integer,Integer> e:mp.entrySet()){
            mp.put(e.getKey(),i);
            i++;
        }
        for(int j=0;j<arr.length;j++){
            arr[j] = mp.get(arr[j]);
        }
        return arr;
    }
}