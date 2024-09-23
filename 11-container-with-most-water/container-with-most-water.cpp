class Solution {
public:
    int maxArea(vector<int>& height) {
        int maxw = 0;
        int i=0;
        int j = height.size()-1;
        int curr;
        while(i<j){
            curr = (j-i)*min(height[i],height[j]);
            if(curr>maxw){
                maxw = curr;
            }
            if(height[i]<=height[j]){
                i++;
            }
            else{
                j--;
            }
            
        }
        return maxw;
    }
};