#include <string>
#include <vector>
#include <utility>
#include <algorithm>

using namespace std;

vector<int> solution(int N, vector<int> stages) {
    vector<int> answer;
    vector<pair<double, int>> arr;
    int total, cnt, from;
    double x;
    
    

	for (int i = 1; i <= N; i++)
	{
		total = 0;
		cnt = 0;

		for (int j = 0; j < stages.size(); j++)
		{
			if (stages[j] == i)
			{
				cnt++;
				total++;
			}
			else if (i < stages[j])
			{
				total++;
			}
		}

        if(total == 0)
            total = 1;
            
		x = cnt;
	    x /= total;

		arr.push_back(make_pair(x, i));
	}

	sort(arr.begin(), arr.end());

	for (int to = arr.size() - 1; 0 <= to; to--)
	{
		from = to - 1;

		while (0 <= from && arr[from].first == arr[to].first)
		{
			from--;
		}

		for (int i = from + 1; i <= to; i++)
		{
			answer.push_back(arr[i].second);
		}

		to = from + 1;
	}
    
    return answer;
}
