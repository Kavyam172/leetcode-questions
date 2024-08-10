class Solution {
public:
    int minMovesToSeat(vector<int>& seats, vector<int>& students) {
        int total = 0;
        sort(seats.begin(),seats.end());
        sort(students.begin(),students.end());
        for(int i=0;i<students.size();i++){
            total+=abs(students[i]-seats[i]);
        }
        return total;
    }
};