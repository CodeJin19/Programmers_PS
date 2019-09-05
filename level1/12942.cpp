//콜라츠_추측

#include <string>
#include <vector>

using namespace std;

int solution(int num) {
    long long x = num;
    int answer = 0;
    
    while(x != 1 && answer <= 500)
    {
        if(x % 2 == 0)
        {
            x /= 2;
        }
        else
        {
            x *= 3;
            x += 1;
        }
        answer++;
    }
    
    if(answer == 501)
    {
        answer = -1;
    }
    
    return answer;
}
