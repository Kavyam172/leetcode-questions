class Solution {
public:
    int nthUglyNumber(int n) {
        map<long long int,int> hash;
        priority_queue<long long int, vector<long long int>, greater<long long int>> ugly;
        ugly.push(1);
        int cnt = 0;
        int curr;
        while(cnt<n){
            curr = ugly.top();
            ugly.pop();
            if(hash.find((long long)curr*2)==hash.end()){
                ugly.push((long long)curr*2);
                hash[(long long)curr*2]==1;
            }
            if(hash.find((long long)curr*3)==hash.end()){
                ugly.push((long long)curr*3);
                hash[(long long)curr*3]==1;
            }
            if(hash.find((long long)curr*5)==hash.end()){
                ugly.push((long long)curr*5);
                hash[(long long)curr*5]==1;
            }
            cnt++;
        }
        return curr;
    }
};