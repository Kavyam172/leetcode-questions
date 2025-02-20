class Solution {
    private String getString(Map<String,Integer> mp,String curr,int n){
        if(curr.length()==n){
            if(!mp.containsKey(curr)){
                return curr;
            }
            return "";
        }
        String a = getString(mp,curr+'0',n);
        String b = getString(mp,curr+'1',n);
        if(a.length()>0){
            return a;
        }
        if(b.length()>0){
            return b;
        }
        return "";
    }
    public String findDifferentBinaryString(String[] nums) {
        Map<String,Integer> mp = new HashMap<>();
        for(String str:nums){
            mp.put(str,1);
        }
        return getString(mp,"",nums.length);
    }
}