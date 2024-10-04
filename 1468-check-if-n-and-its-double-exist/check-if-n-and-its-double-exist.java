class Solution {
    public boolean checkIfExist(int[] arr) {
        Map<Integer,Integer> mp = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            mp.put(arr[i],i);
        }
        for(int i=0;i<arr.length;i++){
            if(mp.containsKey(arr[i]*2) && mp.get(arr[i]*2)!=i){
                return true;
            }
        }
        return false;
    }
}