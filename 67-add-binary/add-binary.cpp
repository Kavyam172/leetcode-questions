class Solution {
public:
    string addBinary(string a, string b) {
        string result = "";
        char carry = '0';
        if (a.length() < b.length()) {
            string padding = "";
            for (int j = 0; j < (b.length() - a.length()); j++) {
                padding += '0';
            }
            a = padding + a;
        }
        if (a.length() > b.length()) {
            string padding = "";
            for (int k = 0; k < (a.length() - b.length()); k++) {
                padding += '0';
            }
            b = padding + b;
        }

        for (int i = a.length() - 1; i >= 0; i--) {
            if (a[i] == '1' && b[i] == '1') {
                if (carry == '1') {
                    result += '1';
                    carry = '1';
                } 
                else {
                    result += '0';
                    carry = '1';
                }
            } 
            else if (a[i] == '0' && b[i] == '0') {
                if (carry == '1') {
                    result += '1';
                    carry = '0';
                } 
                else {
                    result += '0';
                    carry = '0';
                }
            } 
            else if (a[i] != b[i]) {
                if (carry == '1') {
                    result += '0';
                    carry = '1';
                } 
                else {
                    result += '1';
                    carry = '0';
                }
            }
        }
        if (carry == '1') {
            result += '1';
        }
        reverse(result.begin(), result.end());

        return result;
    }
};