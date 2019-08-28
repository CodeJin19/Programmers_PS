//문자열_내_p와_y의_개수

#include <string>
#include <iostream>
using namespace std;

bool solution(string s)
{
    bool answer = true;
    int idx = 0;
    int cnt = 0;
    
    while(s[idx] != '\0')
    {
        if(s[idx] == 'p' || s[idx] == 'P')
        {
            cnt++;
        }
        
        if(s[idx] == 'y' || s[idx] == 'Y')
        {
            cnt--;
        }
        
        idx++;
    }
    
    if(cnt != 0)
    {
        answer = false;
    }

    return answer;
}
