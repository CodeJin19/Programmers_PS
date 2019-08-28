//자연수_뒤집어_배열로_만들기

#include <string>
#include <vector>

using namespace std;

vector<int> solution(long long n) {
    vector<int> answer;
    int idx = 0;
    int x;
    
    while(n != 0)
    {
        x = n % 10;
        answer.push_back(x);
        n /= 10;
    }
    
    return answer;
}
