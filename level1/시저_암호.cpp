#include <string>
#include <vector>

using namespace std;

string solution(string s, int n) {
    string answer = "";
    int x;
    string y;
    
    for(int i = 0; i < s.size(); i++)
    {
        if(s[i] == ' ')
        {
            answer += ' ';
        }
        else if('a' <= s[i])
        {
            x = s[i];
            x += n;
            
            if('z' < x)
            {
                x -= 'z';
                x += 'a';
                x -= 1;
            }
            
            answer += x;
        }
        else if('A' <= s[i])
        {
            x = s[i];
            x += n;
            
            if('Z' < x)
            {
                x -= 'Z';
                x += 'A';
                x -= 1;
            }
            
            answer += x;
        }
    }
    return answer;
}
