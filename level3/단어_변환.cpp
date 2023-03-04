#include <string>
#include <vector>
#include <queue>

using namespace std;

vector <vector <bool>> fld;

int getMin(int x, int y)
{
	if (x < y)
	{
		return x;
	}
	else
	{
		return y;
	}
}

bool check(string x, string y)
{
	int a = x.length();
	int b = y.length();
	int cnt = 0;

	if (a == b)
	{
		for (int i = 0; i < a; ++i)
		{
			if (x[i] != y[i])
			{
				cnt++;
			}
		}

		if (cnt == 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	else
	{
		return false;
	}
}

int bfs(int idx, int cnt, vector <int> cache, vector <string> words, string target)
{
	int len = fld.size();
	int z;

	if (words[idx].compare(target) == 0)
	{
		return cnt;
	}

	queue <int> q;
	int ret = 2112345678;
	int l = cache.size();
	bool isThere;

	for (int i = 0; i < len; ++i)
	{
		isThere = false;

		for (int j = 0; j < l; ++j)
		{
			if (cache[j] == i)
			{
				isThere = true;
				break;
			}
		}

		if (!isThere && fld[idx][i])
		{
			q.push(i);
		}
	}

	while (!q.empty())
	{
		cache.push_back(q.front());
		ret = getMin(ret, bfs(q.front(), cnt + 1, cache, words, target));
		cache.pop_back();
		q.pop();
	}

	return ret;
}

int solution(string begin, string target, vector<string> words) {
	int answer = 0;
	int len = words.size();
	int cnt, startIdx;
	bool start = false;
	bool end = false;
	vector <bool> tmp;
	vector <int> cache;

	for (int i = 0; i < len; ++i)
	{
		if (words[i].compare(begin) == 0)
		{
			startIdx = i;
			start = true;
		}

		if (words[i].compare(target) == 0)
		{
			end = true;
		}
	}

	if (end)
	{
		if (!start)
		{
			words.push_back(begin);
			len++;
			startIdx = len - 1;
		}
		
		for (int i = 0; i < len; ++i)
		{
			tmp.push_back(false);
		}

		for (int i = 0; i < len; ++i)
		{
			fld.push_back(tmp);
		}

		for (int i = 0; i < len - 1; ++i)
		{
			cnt = 0;

			for (int j = i + 1; j < len; ++j)
			{
				if (check(words[i], words[j]))
				{
					fld[i][j] = true;
					fld[j][i] = true;
				}
			}
		}

		answer = bfs(startIdx, 0, cache, words, target);
	}
	else
	{
		answer = 0;
	}

	return answer;
}
