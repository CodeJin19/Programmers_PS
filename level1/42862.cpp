//체육복

#include <string>
#include <vector>

using namespace std;

int solution(int n, vector<int> lost, vector<int> reserve) {
    int answer = 0;
    vector <int> cloth;
    
    for(int i = 0; i <= n + 1; i++)
    {
        cloth.push_back(1);
    }
    
    cloth[0] = 0;
    cloth[n + 1] = 0;
    
    for(int i = 0; i < lost.size(); i++)
    {
        cloth[lost[i]] -= 1;
    }
    
    for(int i = 0; i < reserve.size(); i++)
    {
        cloth[reserve[i]] += 1;
    }
    
    for(int i = 1; i <= n; i++)
    {
        if(cloth[i] == 0)
        {
            if(cloth[i - 1] == 2)
            {
                cloth[i - 1] -= 1;
                answer++;
            }
            else if(cloth[i + 1] == 2)
            {
                cloth[i + 1] -= 1;
                answer++;
            }
        }
        else
        {
            answer++;
        }
    }
    
    return answer;
}
