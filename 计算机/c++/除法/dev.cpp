#include <iostream>
#include <vector>
using namespace std;

 
class methood {
    public:
    string dev(string num1, string num2, int bit) {
        vector<int> numa, numb, dev;
        int length1 = num1.size(), length2 = num2.size();
        int r = 0;

        for (int i = length1 - 1; i >= 0; i--) {
            numa.push_back(num1[i] - '0');
        }
        for (int i = length2 - 1; i >= 0; i--) {
            numb.push_back(num2[i] - '0');
        }

        for (int i = 0; i < numa.size(); i++) {
            r = r * bit + numa[i];
            dev.push_back(r/b);
            
        }
        
        string result = "";
        for (int i = dev.size() - 1; i >= 0; i--) {
            result += to_string(dev[i]);
        }
        return result; 
    }
    
    string mul(string num1, string num2, int bit) {
        if (num1.size() < num2.size()) {
            string tempnum = num1;
            num1 = num2;
            num2 = tempnum;
        }
        
        return 0;;
    }
       
};


int main() {
    string num1, num2;
    int bit;
    methood dev;
    cout << "Sample input: ";
    cin >> num1 >> num2 >> bit;
    cout << "Sample output:" << dev.dev(num1, num2, bit) << endl;
    return 0;
}