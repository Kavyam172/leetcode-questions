class Solution {
    static class Coupon implements Comparable<Coupon> {
        int sortIndex;
        String code;

        Coupon(int sortIndex, String code) {
            this.sortIndex = sortIndex;
            this.code = code;
        }

        @Override
        public int compareTo(Coupon other) {
            if (this.sortIndex != other.sortIndex) {
                return Integer.compare(this.sortIndex, other.sortIndex);
            }
            return this.code.compareTo(other.code);
        }

    }

    public boolean isValidCode(String code){
        
        boolean isValid = code.matches("[a-zA-z0-9]+");

        return isValid;

    }

    public boolean isValidBusiness(String business) {
        List<String> li = new ArrayList<>(List.of("electronics", "grocery", "pharmacy", "restaurant"));

        return li.contains(business);
    }

    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        int n = code.length;

        HashMap<String, Integer> businessSortPriority = new HashMap<>();
        businessSortPriority.put("electronics", 0);
        businessSortPriority.put("grocery", 1);
        businessSortPriority.put("pharmacy", 2);
        businessSortPriority.put("restaurant", 3);

        List<Coupon> coupons = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (isActive[i] && isValidBusiness(businessLine[i]) && isValidCode(code[i])) {
                Coupon c = new Coupon(businessSortPriority.get(businessLine[i]),code[i]);
                coupons.add(c);
            }
        }

        Collections.sort(coupons);

        List<String> res = new ArrayList<>();
        for(Coupon c:coupons){
            res.add(c.code);
        }

        return res;

    }

    
}