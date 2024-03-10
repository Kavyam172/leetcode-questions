class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        unordered_map<int,int> m1;
        unordered_map<int,int> m2;
        vector<int> result;
        for(int i=0;i<nums1.size();i++){
            m1[nums1[i]]++;
        }
        for(int i=0;i<nums2.size();i++){
            m2[nums2[i]]++;
        }
        for(auto iter:m1){
            if(m2[iter.first]>0){
                result.push_back(iter.first);
            }
        }

        return result;

    }
};