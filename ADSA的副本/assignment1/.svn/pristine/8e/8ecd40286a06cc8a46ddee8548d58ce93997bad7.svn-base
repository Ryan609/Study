#include <iostream>
#include <string>
#include <vector>

using namespace std;

class methood {
public:
	string add(string num1, string num2, int bit) {
		vector<int> numa, numb, sum;
		int length1 = num1.size(), length2 = num2.size();
		int carry = 0;
		if (num1.size() < num2.size()) {
			string tempnum = num1;
			num1 = num2;
			num2 = tempnum;
		}
		
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

	string sub(string num1, string num2, int bit) {
		vector<int> numa, numb, sub;
		int length1 = num1.size(), length2 = num2.size();
		int carry = 0;
		
		for (int i = length1 - 1; i >= 0; i--) {
				numa.push_back(num1[i] - '0');
		}
		for (int i = length2 - 1; i >= 0; i--) {
				numb.push_back(num2[i] - '0');
		}
		
		for (int i = 0; i < numa.size(); i++) {
			carry = numa[i] - carry;
			if (i < numb.size()) { 
				carry -= numb[i];
			}
			sub.push_back((carry + bit)%bit);
			if (carry < 0) {
				carry = 1;
			} else {
				carry = 0;
			}
		}
		
		while (sub.back() == 0 && sub.size() > 1) {
			sub.pop_back();
		}
		
		string result = "";
		for (int i = sub.size() - 1; i >= 0; i--) {
				result += to_string(sub[i]);
		}
		return result;
	}

};

int main() {
	string num1, num2;
	int bit;
	methood met;
	cin >> num1 >> num2 >> bit;
	cout << met.add(num1, num2, bit) << endl;

	return 0;
}
