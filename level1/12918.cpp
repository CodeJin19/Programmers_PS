//문자열_다루기_기본

#include <string>
#include <vector>

using namespace std;

bool solution(string s) {
    bool answer = true;
    
    if(s.size() == 4 || s.size() == 6)
    {
        for(int i = 0; i < s.size(); i++)
        {
            if(s[i] < '0' || '9' < s[i])
            {
                answer = false;
                i = s.size();
            }
        }
    }
    else
    {
        answer = false;
    }
    
    return answer;
}
