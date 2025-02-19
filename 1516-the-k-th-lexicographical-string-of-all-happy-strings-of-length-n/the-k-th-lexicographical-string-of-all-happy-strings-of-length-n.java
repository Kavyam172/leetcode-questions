class Solution {
    private void generate(int curr,int n,List<String> happies,String str){
        if(curr==n){
            happies.add(str);
            return;
        }
        if(str.length()==0){
            generate(curr+1,n,happies,str+'a');
            generate(curr+1,n,happies,str+'b');
            generate(curr+1,n,happies,str+'c');
        }
        else{
            char prev = str.charAt(str.length()-1);
            if(prev == 'a'){
                generate(curr+1,n,happies,str+'b');
                generate(curr+1,n,happies,str+'c');
            }
            else if(prev=='b'){
                generate(curr+1,n,happies,str+'a');
                generate(curr+1,n,happies,str+'c');
            }
            else{
                generate(curr+1,n,happies,str+'a');
                generate(curr+1,n,happies,str+'b');
            }
        }
    }
    public String getHappyString(int n, int k) {
        List<String> happies = new ArrayList<>();
        generate(0,n,happies,"");
        Collections.sort(happies);
        if(k>happies.size()){
            return "";
        }
        return happies.get(k-1);
    }


}