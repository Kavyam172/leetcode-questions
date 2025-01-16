class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int xor1 = 0;
        int xor2 = 0;

        for(int i=0;i<l1;i++){
            xor1^=nums1[i];
        }
        for(int i=0;i<l2;i++){
            xor2 ^= nums2[i];
        }

        return (l1%2==0?0:xor2) ^ (l2%2==0?0:xor1);

    }
}