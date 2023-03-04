#include <string>
#include <vector>

using namespace std;

int count(vector <string> & words, int idx)
{
	int ret = 0, cnt, len = words.size();
	char x;
	vector <string> tmp, list;

	for (int i = 0; i < len; ++i)
	{
		if (words[i].length() == idx)
		{
			ret += idx;
		}
		else
		{
			tmp.push_back(words[i]);
		}
	}

	len = tmp.size();

	for (int i = 0; i < 26; ++i)
	{
		list.clear();
		x = 'a' + i;
		cnt = 0;

		for (int j = 0; j < len; ++j)
		{
			if (tmp[j][idx] == x)
			{
				list.push_back(tmp[j]);
				cnt++;
			}
		}

		if (cnt == 1)
		{
			ret += idx + 1;
		}
		else if(cnt != 0)
		{
			ret += count(list, idx + 1);
		}
	}

	return ret;
}

int solution(vector<string> words) {
    return count(words, 0);
}
