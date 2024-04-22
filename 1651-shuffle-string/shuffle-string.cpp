class Solution {
public:
    string restoreString(string s, vector<int>& indices) {
        int i=0;
        while(i<s.length()){
            cout<<i<<endl;
            if(i==indices[i]){
                i++;
                continue;
            }
            else{
                cout<<s[i]<<"before"<<' ';
                char temp = s[i];
                s[i] = s[indices[i]];
                s[indices[i]] = temp;
                cout<<s[i]<<"after ";
                

                cout<<indices[i]<<"bef ";
                int temp2 = indices[i];
                indices[i] = indices[indices[i]];
                indices[temp2] = temp2;
                cout<<indices[i]<<"aft ";
                // i++;
            }
        }
        return s;
    }
};