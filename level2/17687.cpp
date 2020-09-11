//[3차] n진수 게임

#include <string>
#include <vector>
#include <algorithm>

using namespace std;

string change(int x, int n)
{
    string ret = "";
    int r;
    
    if(x == 0)
    {
        return "0";
    }
    
    while(x != 0)
    {
        r = x % n;
        x /= n;
        
        if(r < 10)
        {
            ret += (char) ('0' + r);
        }
        else
        {
            ret += (char) ('A' + (r - 10));
        }
    }
    
    reverse(ret.begin(), ret.end());
    
    return ret;
}

string solution(int n, int t, int m, int p) {
    string answer = "";
    string str = "";
    string tmp;
    int total = 0, idx = p - 1, num = 0, len, cnt = 0;
    
    while(cnt <= t)
    {
        tmp = change(num, n);
        len = tmp.length();
        str += tmp;
        total += len;
        num ++;
        
        while(idx < total)
        {
            idx += m;
            cnt++;
        }
    }
    
    idx = p - 1;
    
    for(int i = 0; i < t; ++i)
    {
        answer += str[idx];
        idx += m;
    }
    
    return answer;
}
