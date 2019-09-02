//문자열을_정수로_바꾸기

#include <string>
#include <vector>
#include <iostream>

using namespace std;

int solution(string s) {
    int answer = 0, begin;
    
    if(s[0] == '-')
    {
        for(int i = 1; i < s.length(); i++)
        {
            answer *= 10;
            answer += (s[i] - '0');
        }
        
        answer = 0 - answer;
    }
    else if(s[0] == '+')
    {
        for(int i = 1; i < s.length(); i++)
        {
            answer *= 10;
            answer += (s[i] - '0');
        }
    }
    else
    {
        for(int i = 0; i < s.length(); i++)
        {
            answer *= 10;
            answer += (s[i] - '0');
        }
    }
    
    return answer;
}
