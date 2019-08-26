//두_정수_사이의_합

#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

long long solution(int a, int b) {
    long long answer = 0;
    int tmp;
    
    if(b < a)
    {
        tmp = a;
        a = b;
        b = tmp;
    }
    
    answer = (a + b);
    
    if(answer % 2 == 0)
    {
        answer /= 2;
        answer *= (b - a + 1);
    }
    else
    {
        answer *= ((b - a + 1) / 2);
    }
    
    return answer;
}
