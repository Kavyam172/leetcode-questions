#include<cmath>

class Solution {
public:
    int mySqrt(int x) {
        // using sqrt() function
        // int result = sqrt(x);

        //using binary search

        int result = -1;
        int start = 0;
        int end = x;
        long int mid;
        
        while(start<=end){
            mid = (start + end)/2;
            if(mid*mid==x){
                return mid;
            }
            else if(mid*mid<x){
                result=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            // mid = (start+end)/2;
        }

        return result;
        
    }
};