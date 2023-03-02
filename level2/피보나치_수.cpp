#include <string>
#include <vector>

using namespace std;

int solution(int n) {
    int answer = 0;
    int a, b, c, cnt;
    
    if(n <= 1)
    {
        answer = n;
    }
    else
    {
        a = 0;
        b = 1;
        c = 1;
        cnt = 2;
        
        while(cnt < n)
        {
            a = b;
            b = c;
            c = a + b;
            
            if(1234567 <= c)
            {
                c %= 1234567;
            }
            
            cnt++;
        }
        
        answer = c;
    }
    
    return answer;
}
