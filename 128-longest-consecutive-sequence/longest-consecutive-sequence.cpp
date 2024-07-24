class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        if(nums.size()==0){
            return 0;
        }
        unordered_set<int> s;
        for(int i=0;i<nums.size();i++){
            s.insert(nums[i]);
        }
        int max = 1;

        for(auto iter:s){
            if(s.find(iter-1)==s.end()){
                int c = 1;
                int temp = iter;
                while(s.find(temp+1)!=s.end()){
                    c+=1;
                    temp+=1;
                }
                if(c>max){
                    max = c;
                }
                c = 0;  
            }

        }
        return max;
    }
};