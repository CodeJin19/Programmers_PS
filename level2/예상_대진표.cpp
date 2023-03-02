#include <iostream>

using namespace std;

int solution(int n, int a, int b)
{
    int x = a;
    int y = b;
    int answer = 0;
    
    while (x != y)
    {
        x++;
        y++;
        
        x /= 2;
        y /= 2;
        
        answer++;
    }

    return answer;
}
