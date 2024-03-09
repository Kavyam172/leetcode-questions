class Solution {
public:
    int getCommon(vector<int>& nums1, vector<int>& nums2) {
        unordered_map<int,int> m;
        int result=-1;
        for(int i=0;i<nums1.size();i++){
            m[nums1[i]]++;
        }
        for(int i=0;i<nums2.size();i++){
            if(m[nums2[i]]>0){
                result = nums2[i];
                break;
            }
        }

        return result;
    }
};