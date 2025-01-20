class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int high = letters.length-1;
        int low = 0;
        int mid = (low+high)/2;

        while(low<=high){
            if(letters[mid]<=target){
                low = mid+1;
            }
            if(letters[mid]>target){
                high = mid-1;
            }
            mid = (low+high)/2;
        }

        return letters[low%letters.length];
    }
}