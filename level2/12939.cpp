//최댓값과 

#include <string>
#include <vector>
#include <iostream>

using namespace std;

int atoi(string s, int from, int to)
{
    int ret = 0;
    
    for(int i = from; i < to; i++)
    {
        ret *= 10;
        ret += (s[i] - '0');
    }
    
    return ret;
}

string solution(string s) {
    string answer = "", sub;
    int idx = 0, len = s.length(), start = 0, end, num, max, min;
    
    while(s[idx] != ' ')
        idx++;
    
    end = idx;
    
    if(s[start] == '-')
    {
        num = atoi(s, start + 1, end);
        num = 0 - num;
    }
    else
        num = atoi(s, start, end);
    
    max = num;
    min = num;
    
    while(idx < len)
    {
        idx++;
        start = idx;
        
        while(s[idx] != ' ' && idx < len)
            idx++;
        
        end = idx;
        
        if(s[start] == '-')
        {
            num = atoi(s, start + 1, end);
            num = 0 - num;
        }
        else
            num = atoi(s, start, end);
        
        if (max < num)
            max = num;
        
        if (num < min)
            min = num;
    }
    
    if(min < 0)
    {
        sub = "";
        min = 0 - min;
        
        while(min != 0)
        {
            sub += (min % 10 + '0');
            min /= 10;
        }
        
        sub += "-";
    }
    else
    {
        sub = "";
        
        while(min != 0)
        {
            sub += (min % 10 + '0');
            min /= 10;
        }
    }
    
    for(int i = sub.length() - 1; 0 <= i; i--)
        answer += sub[i];
    
    answer += " ";
    
    if(max < 0)
    {
        sub = "";
        max = 0 - max;
        
        while(max != 0)
        {
            sub += (max % 10 + '0');
            max /= 10;
        }
        
        sub += "-";
    }
    else
    {
        sub = "";
        
        while(max != 0)
        {
            sub += (max % 10 + '0');
            max /= 10;
        }
    }
    
    for(int i = sub.length() - 1; 0 <= i; i--)
        answer += sub[i];
    
    return answer;
}
