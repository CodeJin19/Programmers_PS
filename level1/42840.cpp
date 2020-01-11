//모의고사

#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> answers) {
    vector<int> answer;
    int first[5] = {1, 2, 3, 4, 5};
    int second[8] = {2, 1, 2, 3, 2, 4, 2, 5};
    int third[10] = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    int score[3];
    int max = 0;
    
    for(int i = 0; i < 3; i++)
    {
        score[i] = 0;
    }
    
    for (int i = 0; i < answers.size(); i++)
	{        
        if(first[i % 5] == answers[i])
        {
            score[0] += 1;
        }
        
        if(second[i % 8] == answers[i])
        {
            score[1] += 1;
        }
        
        if(third[i % 10] == answers[i])
        {
            score[2] += 1;
        }
	}
    
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
