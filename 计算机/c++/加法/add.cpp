#include <iostream>
#include <vector>
using namespace std;

 
class methood {
    public:
    string mul(string num1, string num2, int bit) {
        vector<int> numa, numb, sum;
        int length1 = num1.size(), length2 = num2.size();
        int carry = 0;
        
        for (int i = length1 - 1; i >= 0; i--) {
            numa.push_back(num1[i] - '0');
        }
        for (int i = length2 - 1; i >= 0; i--) {
            numb.push_back(num2[i] - '0');
        }
        
        if (length1 < length2) {
            return mul(num2, num1, bit);
        }
        if (length2 ==1) {
            string output = "0";
            for (int i = 0; i < numb[0]; i++) {
                output = add(output, num1, bit);
            }
            return  output;
        }
    }
    
    string add(string num1, string num2, int bit) {
        vector<int> numa, numb, sum;
        int length1 = num1.size(), length2 = num2.size();
        int carry = 0;

        for (int i = length1 - 1; i >= 0; i--) {
            numa.push_back(num1[i] - '0');
        }
        for (int i = length2 - 1; i >= 0; i--) {
            numb.push_back(num2[i] - '0');
        }

        for (int i = 0; i < numa.size(); i++) {
            carry = numa[i] + carry;
            if (i < numb.size()) {
                carry += numb[i];
            }
            sum.push_back(carry % bit);
            carry /= bit;
        }
        if (carry > 0) {
            sum.push_back(carry);
        }
        
        string result = "";
        for (int i = sum.size() - 1; i >= 0; i--) {
            result += to_string(sum[i]);
        }
        return result; 
    }
    
};


int main() {
    string num1, num2;
    int bit;
    methood foo;
    cout << "Sample input: ";
    cin >> num1 >> num2 >> bit;
    cout << "Sample output:" << foo.add(num1, num2, bit) << " " << foo.mul(num1, num2, bit) << endl;
    return 0;
}