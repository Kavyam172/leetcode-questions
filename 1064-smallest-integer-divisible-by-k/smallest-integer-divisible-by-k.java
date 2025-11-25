class Solution {
    public int smallestRepunitDivByK(int k) {
        HashSet<Integer> hash =  new HashSet<>();

        int n = 1;
        int len = 1;
        while(n%k!=0){
            int rem = n%k;
            if(hash.contains(rem)){
                return -1;
            }
            else{
                hash.add(rem);
            }
            n = rem*10 + 1;
            len++;
        }

        return len;


    }
}