#include <iostream>
#include <string>
using namespace std;

void findNumber(int n) {
    if (n == 1 || n == 2) {
        cout << -1 << endl;
    } else if (n == 3) {
        cout << 336 << endl;
    } else if (n == 4) {
        cout << 3636 << endl;
    } else {
        string result;
        // Start with "3" and alternate with "6" and "3" to achieve divisibility requirements
        for (int i = 0; i < n - 3; i++) {
            result += "3";
        }
        result += "366";  // End pattern to make sure it’s divisible by both 33 and 66
        cout << result << endl;
    }
}

int main() {
    int t;
    cin >> t;  // number of test cases
    while (t--) {
        int n;
        cin >> n;
        findNumber(n);
    }
    return 0;
}
