class Solution {
    public int gcd(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public int countTrapezoids(int[][] points) {
        HashMap<List<Integer>,HashMap<Integer,Integer>> mp = new HashMap<>();
        HashMap<List<Integer>,HashMap<List<Integer>,Integer>> mid = new HashMap<>();

        for(int i=0;i<points.length;i++){
            for(int j=i+1;j<points.length;j++){
                int[] p1 = points[i];
                int[] p2 = points[j];
                int dx = p2[0]-p1[0];
                int dy = p2[1]-p1[1];

                int midx = (p1[0]+p2[0]);
                int midy = (p1[1]+p2[1]);

                List<Integer> midpoint = Arrays.asList(midx,midy);


                if(dx<0){
                    dy = dy*(-1);
                    dx = dx*(-1);
                }

                int GCD = gcd(dy,dx);

                dy = dy/GCD;
                dx = dx/GCD;
                if(dx==0 && dy<0){
                    dy = dy*(-1);
                }

                List<Integer> m = Arrays.asList(dy,dx);
                int c = (dx*p2[1]) - (dy*p2[0]);


                if(mp.containsKey(m)){
                    HashMap<Integer,Integer> intercepts = mp.get(m);
                    intercepts.put(c,intercepts.getOrDefault(c,0)+1);
                    mp.put(m,intercepts);
                }
                else {
                    HashMap<Integer,Integer> intercepts = new HashMap<>();
                    intercepts.put(c,1);
                    mp.put(m,intercepts);
                }

                if(mid.containsKey(midpoint)){
                    HashMap<List<Integer>,Integer> slopes = mid.get(midpoint);
                    slopes.put(m,slopes.getOrDefault(m,0)+1);
                    mid.put(midpoint,slopes);
                }
                else{
                    HashMap<List<Integer>,Integer> slopes = new HashMap<>();
                    slopes.put(m,1);
                    mid.put(midpoint,slopes);
                }
            }
        }
        int trapezoids = 0;

        for(HashMap<Integer,Integer> slope:mp.values()){
            int edgeFound = 0;
            for(Integer count:slope.values()){
                trapezoids = (trapezoids + (count*edgeFound));
                edgeFound+=count;
            }
        }

        int parallelograms = 0;

        for(HashMap<List<Integer>,Integer> slopes:mid.values()){
            int edgesFound = 0;
            for(Integer count:slopes.values()){
                parallelograms+=(count*edgesFound);
                edgesFound+=count;
            }
        }

        return trapezoids-parallelograms;
    }
}