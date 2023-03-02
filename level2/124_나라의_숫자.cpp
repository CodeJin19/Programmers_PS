#include <string>
#include <vector>

using namespace std;

string solution(int n) {
    string answer = "";
    int total, len, x, bottom;
    
    if (n == 1)
        answer = "1";
    else if (n == 2)
        answer = "2";
    else if (n == 3)
        answer = "4";
    else
    {
        len = 1;
        total = 3;
        x = 3;
        
        while(total < n)
        {
            x *= 3;
            total += x;
            len++;
        }
        
        bottom = total - x;
        n -= (bottom + 1);
        x = 1;
        
        for (int i = 1; i < len; ++i)
            x *= 3;
        
        for (int i = 0; i < len; ++i)
        {
            if(n < x)
            {
                answer += "1";
            }
            else if (n < x * 2)
            {
                n -= x;
                answer += "2";
            }
            else
            {
                n -= (x * 2);
                answer += "4";
            }
            
            x /= 3;
        }
    }
    
    return answer;
}
