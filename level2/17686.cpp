// [3차] 파일명 정렬

#include <string>
#include <vector>
#include <algorithm>

using namespace std;

bool compare(pair <string, int> a, pair <string, int> b)
{
	int x = 0, y = 0, l;

	l = a.first.length();

	for (int i = 0; i < l; ++i)
	{
		x *= 10;
		x += (int)(a.first[i] - '0');
	}

	l = b.first.length();

	for (int i = 0; i < l; ++i)
	{
		y *= 10;
		y += (int)(b.first[i] - '0');
	}

	if (x == y)
	{
		return a.second < b.second;
	}
	else
	{
		return x < y;
	}
}

vector<string> solution(vector<string> files) {
	string x;
	int len = files.size(), l, limit, cnt, idx;
    bool hasFound;
	vector<pair <string, int>> tmp;
	vector<pair <string, int>> tmp2;
	vector<string> answer;

	for (int i = 0; i < len; ++i)
	{
		l = files[i].length();
		x = "";

		for (int j = 0; j < l; ++j)
		{
            if ('0' <= files[i][j] && files[i][j] <= '9')
			{
				tmp.push_back(make_pair(x, i));
				break;
			}
            else if ('A' <= files[i][j] && files[i][j] <= 'Z')
			{
				x += (char)(files[i][j] - 'A' + 'a');
			}
			else
			{
				x += files[i][j];
			}
		}
	}

	sort(tmp.begin(), tmp.end());
	
	for (idx = 0; idx < len - 1; ++idx)
	{
		if (tmp[idx].first != tmp[idx + 1].first)
		{
			answer.push_back(files[tmp[idx].second]);
		}
		else
		{
			l = 1;

			while (idx + l < len && tmp[idx].first == tmp[idx + l].first)
			{
				++l;
			}

			tmp2.clear();

			for (int j = 0; j < l; ++j)
			{
				x = "";
                cnt = 0;
                hasFound = false;

				limit = files[tmp[idx + j].second].length();
				
				for (int k = 0; k < limit; ++k)
				{
					if ('0' <= files[tmp[idx + j].second][k] && files[tmp[idx + j].second][k] <= '9')
					{
                        if(cnt < 5)
                        {
                            x += files[tmp[idx + j].second][k];
                            cnt++;
                        }
                        else
                        {
                            break;
                        }
					}
					else if(x.compare("") != 0)
					{
						break;
					}
				}
				
				tmp2.push_back(make_pair(x, idx + j));
			}
			
			sort(tmp2.begin(), tmp2.end(), compare);
			
			for (int j = 0; j < l; ++j)
			{
				answer.push_back(files[tmp[tmp2[j].second].second]);
			}

			idx += l;
			idx--;
		}
	}
    
    if(idx == len - 1)
    {
        answer.push_back(files[len - 1]);
    }
    
    return answer;
}
