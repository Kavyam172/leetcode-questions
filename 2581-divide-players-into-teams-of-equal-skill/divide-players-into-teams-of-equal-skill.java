class Solution {
    public long dividePlayers(int[] skill) {
        int teams = skill.length/2;
        int total = 0;
        for(int i=0;i<skill.length;i++){
            total+=skill[i];
        }
        if(total%teams!=0){
            return -1;
        }
        int sk = total/teams;
        Map<Integer,Integer> pairs = new HashMap<>();
        Arrays.sort(skill);
        int i=0;
        int j=skill.length-1;
        while(i<j){
            if(skill[i]+skill[j]==sk){
                pairs.put(i,j);
                i++;
                j--;
            }
            else{
                return -1;
            }
        }
        long chemistry = 0;

        for(Map.Entry<Integer,Integer> e:pairs.entrySet()){
            chemistry+=skill[e.getKey()]*skill[e.getValue()];
        }
        return chemistry;        
    }
}