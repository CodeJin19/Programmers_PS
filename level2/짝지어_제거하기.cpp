#include <vector>
#include <string>

using namespace std;

int solution(string s)
{
    int cnt = 0;
    int answer;
    int len = s.length();
    vector <char> stack;
    
    for (int i = 0; i < len; ++i)
    {
        if (cnt == 0)
        {
            stack.push_back(s[i]);
            cnt++;
        } 
        else if (stack.back() == s[i])
        {
            stack.pop_back();
            cnt--;
        }
        else
        {
            stack.push_back(s[i]);
            cnt++;
        }
    }
    
    if (cnt == 0)
        answer = 1;
    else
        answer = 0;
    
    /*
    int idx;
    int cnt = 0;
    int answer = 0;
    int len = s.length();
    
    for(int i = 0; i < len - 1;)
    {        
        if(s[i] != 'X')
        {
            idx = i + 1;
            
            while(idx < len && s[idx] == 'X')
            {
                ++idx;
            }
            
            if (len <= idx)
            {
                break;
            }
            else if(s[i] == s[idx])
            {
                s[i] = 'X';
                s[idx] = 'X';
                cnt += 2;
                
                if(i == 0)
                    i = idx + 1;
                else
                    --i;
            }
            else
            {
                i = idx;
            }
        }
        else
        {
            ++i;
        }
    }
    
    if(cnt == len)
        answer = 1;
    else
        answer = 0;
    */
    
    return answer;
}
