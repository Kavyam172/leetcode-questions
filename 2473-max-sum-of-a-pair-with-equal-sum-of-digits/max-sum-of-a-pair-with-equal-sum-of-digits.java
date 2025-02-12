class Solution {
    private int digitSum(int num){
        int sum = 0;
        while(num>0){
            int digit = num%10;
            sum+=digit;
            num/=10;
        }
        return sum;
    }
    public int maximumSum(int[] nums) {
        int maxm =-1;
        Map<Integer,PriorityQueue<Integer>> sums = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int sum = digitSum(nums[i]);
            sums.computeIfAbsent(sum,key->new PriorityQueue<Integer>((x,y)->y-x));
            sums.get(sum).offer(nums[i]);
        }

        for(Map.Entry<Integer,PriorityQueue<Integer>> ele:sums.entrySet()){
            PriorityQueue<Integer> pq = ele.getValue();
            if(pq.size()<=1){
                continue;
            }
            int first = pq.poll();
            int second = pq.poll();

            maxm = Math.max(maxm,first+second);
        }
        return maxm;
    }
}