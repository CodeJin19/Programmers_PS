#include <string>
#include <vector>
#include <algorithm>

using namespace std;

long long solution(long long n) {
    long long answer = 0;
    vector <int> arr;
    int x;
    
    while(n != 0)
    {
        x = n % 10;
        arr.push_back(x);
        n /= 10;
    }
    
    sort(arr.begin(), arr.end());
    
    for(int i = arr.size() - 1; 0 <= i; i--)
    {
        answer *= 10;
        answer += arr[i];
    }
    
    return answer;
}
