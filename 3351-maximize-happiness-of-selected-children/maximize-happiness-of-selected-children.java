class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        PriorityQueue<Integer> happy = new PriorityQueue<>((a,b)->b-a);

        for(int i=0;i<happiness.length;i++){
            happy.add(happiness[i]);
        }

        long turns = 0;
        long ans = 0;

        while(!happy.isEmpty() && turns<k){
            int top = happy.poll();
            ans+=Math.max(0,top-turns);
            turns++;
        }
        return ans;
    }
}