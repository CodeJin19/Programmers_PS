#include <string>
#include <vector>

using namespace std;

string solution(string s) {
    string answer = "";
    int idx = 0;
    int x;
    
    for (int i = 0; i < s.length(); i++)
	{
		if ('a' <= s[i] && s[i] <= 'z')
		{
			if (idx % 2 == 0)
			{
				x = s[i];
				x -= 'a';
				x += 'A';
				s[i] = x;
			}

			idx++;
		}
		else if ('A' <= s[i] && s[i] <= 'Z')
		{
			if (idx % 2 == 1)
			{
				x = s[i];
				x -= 'A';
				x += 'a';
				s[i] = x;
			}

			idx++;
		}
		else if (s[i] == ' ')
		{
			idx = 0;
		}
	}
    
    answer = s;
    return answer;
}
