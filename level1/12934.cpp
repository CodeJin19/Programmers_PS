//정수_제곱근_판별

#include <string>
#include <vector>
#include <math.h>

using namespace std;

long long solution(long long n) {
    long long answer = 0;
    double rt;
    int x;

    rt = sqrt(n);
    answer = (int) rt;
    
    if(answer * answer == n)
    {
        answer = (answer + 1) * (answer + 1);
    }
    else
    {
        answer = -1;
    }
    
    return answer;
}
