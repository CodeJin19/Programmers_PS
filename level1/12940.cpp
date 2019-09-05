//최대공약수와_최소공배수

#include <string>
#include <vector>

using namespace std;

vector<int> solution(int n, int m) {
    vector<int> answer;
    int x, y, r;
    
    if(m <= n)
    {
        x = n;
        y = m;
    }
    else
    {
        x = m;
        y = n;
    }
    
    r = x % y;
    
    while(r != 0)
    {
        x = y;
        y = r;
        r = x % y;
    }
    
    answer.push_back(y);
    answer.push_back(n / y * m);
    
    return answer;
}
