class Solution {
public:
    vector<int> numberGame(vector<int>& nums) {
        vector<int> arr;
        priority_queue<int, vector<int>, greater<int>> p;
        int alice,bob,flag=0;
        for(int i = 0;i<nums.size();i++){
            p.push(nums[i]);
        }
        while(!p.empty()){
            alice = p.top();
            p.pop();
            bob = p.top();
            p.pop();
            arr.push_back(bob);
            arr.push_back(alice);
            
        }
        return arr;
        
    }
};