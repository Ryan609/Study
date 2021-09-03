#include <iostream>
#include <vector>

using namespace std;

 
class methood {
    public:
    //string mul(string num1, string num2, int bit) {
//        vector<int> numa, numb, mul;
//        //vector<int> mul(numa.size() + numb.size(), 0);
//        int length1 = num1.size(), length2 = num2.size();
//        int carry = 0;
//        
////        if (num1.size()<num2.size()) {
//////            string tempnum = num1;
//////            num1 = num2;
//////            num2 = tempnum;
//////        }
//
//        for (int i = length1 - 1; i >= 0; i--) {
//            numa.push_back(num1[i] - '0');
//        }
//        for (int i = length2 - 1; i >= 0; i--) {
//            numb.push_back(num2[i] - '0');
//        }
//        
//        for (int i = 0; i < numa.size(); i++) {
//            for (int j = 0; j < numb.size(); j++) {
//                mul[i+j] += numa[i] * numb[j];
//            }
//            mul.push_back(mul[i]);
//        }
//        
//        
//        for (int i = 0; i < mul.size(); i++) {
//            carry += mul[i];
//            mul[i] = carry % bit;
//            carry /= bit;
//        }
//        
//        while (mul.back() == 0 && mul.size() > 1) {
//            mul.pop_back();
//        }
//        
//        string result = "";
//        for (int i = mul.size() - 1; i >= 0; i--) {
//            result += to_string(mul[i]);
//        }
//        return result; 
//    }
        
//       string mul(string num1, string num2, int bit) {
//            int length1 = num1.size(), length2 = num2.size();
//            vector<int> numa,numb;
//            vector<int> res(length1 + length2, 0);
//            
//            for (int i = length1 - 1; i >= 0; i--) {
//                numa.push_back(num1[i] - '0');
//            }
//            for (int i = length2 - 1; i >= 0; i--) {
//                numb.push_back(num2[i] - '0');
//            }
//            
//            for (int i = numa.size() - 1; i >= 0; i--) {
//                for (int j = numb.size() - 1; j >= 0; j--) {
//                    res[i+j+1] += numa[i]  * numb[j];
//                }
//            }
//            for (int i = 0; i < length1+length2-1; i++) {
//                res[i+1] += res[i]/bit;
//                res[i] %= bit;
//            }
//            
//            while (res.size() >1 && res[0] == 0) {
//                res.erase(res.begin());
//            }
//            
//            string result = "";
//            for (int i = res.size() - 1; i >= 0; i--) {
//            result += to_string(res[i]);
//            }
//            return result; 
//        }
    
    string mul(string num1, string num2, int bit) {
        int length1 = num1.size(), length2 = num2.size();
        vector<int> numa,numb;
        vector<int> res(length1 + length2, 0);
    
        for (int i = length1 - 1; i >= 0; i--) {
            numa.push_back(num1[i] - '0');
        }
        for (int i = length2 - 1; i >= 0; i--) {
            numb.push_back(num2[i] - '0');
        }
        
        int carry;
        for (int i = numa.size() - 1; i >= 0; i--) {
            for (int j = numb.size() - 1; j >= 0; j--) {
                carry = numa[i] + numb[j];
                res[i+j+1] += (carry % bit);
                res[i+j] += (carry / bit);
            }
        }

        for (int i = 0; i < length1+length2-1; i++) {
            res[i-1] += res[i] /bit;
            res[i] = res[i] % bit;
        }
        

        while (res.size() >1 && res[0] == 0) {
            res.erase(res.begin());
        }
        
        string result = "";
        for (int i = res.size() - 1; i >= 0; i--) {
            result += to_string(res[i]);
        }
        return result; 
    }
    
//    string Kmul(string num1, string num2, int bit) {
//        int len = num1.size();
//        string a = num1.substr(0, len / 2 + len % 2);
//        string b = num1.substr(len / 2 + len % 2, len / 2);
//        int len_d = min((int)num2.size(), len / 2 );
//        string c = num2.substr(0, num2.size() - len_d);
//        string d = num2.substr(num2.size() - len_d, len_d);
//        
//        string ac = Kmul(a, c, bit);
//        string bd = Kmul(b, d, bit);
//        string ad_plus_bc = mul(add(a, b, bit), add(c, d, bit), bit);
//        ad_plus_bc = sub(ad_plus_bc, ac, bit);
//        ad_plus_bc = sub(ad_plus_bc, bd, bit);
//        
//        for (int i = 0; i < 2 * (len / 2 ); ++i) {
//            ac.push_back('0');
//        }
//        for (int i = 0; i < (len / 2); i++) {
//            ad_plus_bc.push_back('0');
//        }
//        
//        string output = add(ac, ad_plus_bc, bit);
//        output = add(output, bd, bit);
//        return output;
//    }
};


int main() {
    string num1, num2;
    int bit;
    methood mul;
    cout << "Sample input: ";
    cin >> num1 >> num2 >> bit;
    cout << "Sample output:" << mul.mul(num1, num2, bit) << endl;
    return 0;
}