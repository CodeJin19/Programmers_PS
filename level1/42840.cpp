//

#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> answers) {
    vector<int> answer;
    int score[3];
    int x, max;
    
    for(int i = 0; i < 3; i++)
    {
        score[i] = 0;
    }
    
    for (int i = 0; i < answers.size(); i++)
	{
		x = i % 5;

		switch (x)
		{
		case 0:
			if (1 == answers[i])
			{
				score[0] += 1;
			}
			break;
		case 1:
			if (2 == answers[i])
			{
				score[0] += 1;
			}
			break;
		case 2:
			if (3 == answers[i])
			{
				score[0] += 1;
			}
			break;
		case 3:
			if (4 == answers[i])
			{
				score[0] += 1;
			}
			break;
		case 4:
			if (5 == answers[i])
			{
				score[0] += 1;
			}
			break;
		}

		x = i % 8;

		switch (x)
		{
		case 0:
		case 2:
		case 4:
		case 6:
			if (2 == answers[i])
			{
				score[1] += 1;
			}
			break;
		case 1:
			if (1 == answers[i])
			{
				score[1] += 1;
			}
			break;
		case 3:
			if (3 == answers[i])
			{
				score[1] += 1;
			}
			break;
		case 5:
			if (4 == answers[i])
			{
				score[1] += 1;
			}
			break;
		case 7:
			if (5 == answers[i])
			{
				score[1] += 1;
			}
			break;
		}

		x = i % 10;

		switch (x)
		{
		case 0:
		case 1:
			if (3 == answers[i])
			{
				score[2] += 1;
			}
			break;
		case 2:
		case 3:
			if (1 == answers[i])
			{
				score[2] += 1;
			}
			break;
		case 4:
		case 5:
			if (2 == answers[i])
			{
				score[2] += 1;
			}
			break;
		case 6:
		case 7:
			if (4 == answers[i])
			{
				score[2] += 1;
			}
			break;
		case 8:
		case 9:
			if (5 == answers[i])
			{
				score[2] += 1;
			}
			break;
		}
	}
    
    max = 0;
    
    for(int i = 0; i < 3; i++)
    {
        if(max < score[i])
        {
            max = score[i];
        }
    }
    
    for(int i = 0; i < 3; i++)
    {
        if(max == score[i])
        {
            answer.push_back(i + 1);
        }
    }
    
    return answer;
}
