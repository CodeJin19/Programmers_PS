//큰 수 만들기

#include <string>
#include <vector>

using namespace std;

string solution(string number, int k) {
    string answer = "";
    int len = number.length(), idx;
    char max;
    
    for(idx = 0; idx < len; ++idx)
    {
        if(k == 0)
        {
            break;
        }
        
        max = '0';
        
        for(int j = 0; j <= k; ++j)
        {
            if(max < number[idx + j])
            {
                max = number[idx + j];
            }
        }
        
        while(number[idx] != max)
        {
            ++idx;
            k--;
        }
        
        answer += max;
    }
    
    if(idx < len - 1)
    {
        for(; idx < len; ++idx)
        {
            answer += number[idx];
        }
    }

    if(0 < k)
    {
        len = answer.length();
        answer = answer.substr(0, len - k);
    }
    
    return answer;
}
