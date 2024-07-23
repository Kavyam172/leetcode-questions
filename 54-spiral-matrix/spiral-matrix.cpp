class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        vector<int> res;
        int right = matrix[0].size();
        int left = -1;
        int top = -1;
        int bottom = matrix.size();
        int i=0;
        int j=0;
        while((i<bottom && i>top) && (j<right && j>left)){
            while(j<right && ((i<bottom && i>top) && (j<right && j>left))){
                res.push_back(matrix[i][j]);
                j++;
            }
            j--;
            i++;
            top++;
            while(i<bottom && ((i<bottom && i>top) && (j<right && j>left))){
                res.push_back(matrix[i][j]);
                i++;
            }
            i--;
            j--;
            right--;
            while(j>left && ((i<bottom && i>top) && (j<right && j>left))){
                res.push_back(matrix[i][j]);
                j--;
            }
            j++;
            i--;
            bottom--;
            while(i>top && ((i<bottom && i>top) && (j<right && j>left))){
                res.push_back(matrix[i][j]);
                i--;
            }
            i++;
            j++;
            left++;
        }
        return res;
    }
};