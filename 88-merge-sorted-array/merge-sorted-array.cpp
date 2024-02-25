class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int i=0,j=0,l=m;
        while(j<n && i<l){
            if(nums1[i]<nums2[j]){
                if(nums1[i]==0 && i>l){
                    break;
                }
                i++;
            }
            else{
                for(int k=l-1;k>=i;k--){
                    nums1[k+1] = nums1[k];
                }
                nums1[i]=nums2[j];
                j++;
                i++;
                l++;
            }
        }
        while(i<(m+n) && j<n && !(nums2.empty())){
            nums1[i]=nums2[j];
            i++;
            j++;
        }
    }
};