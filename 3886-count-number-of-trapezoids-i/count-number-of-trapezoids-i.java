class Solution {
    public int countTrapezoids(int[][] points) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        final int mod = 1000000007;
        int edgesFound = 0;
        int trapezoids = 0;

        for(int[] point:points){
            mp.put(point[1],mp.getOrDefault(point[1],0)+1);
        }

        for(int p:mp.values()){
            long edges = ((long)(p) * (p-1))/2;

            // number of trapezoids made from current edges will be edges * edges already found so we add that.
            trapezoids = (int)((trapezoids + (edges*edgesFound)) % mod);
            edgesFound += edges;
        }

        return trapezoids;

    }
}