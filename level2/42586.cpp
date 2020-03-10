//기능개발

#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> progresses, vector<int> speeds) {
    vector<int> answer;
    vector<int> days;
    int x;
    
    for(int i = 0; i < progresses.size(); i++)
    {
        x = 100 - progresses[i];
        
        if(x % speeds[i] == 0)
        {
            days.push_back(x / speeds[i]);
        }
        else
        {
            days.push_back((x / speeds[i]) + 1);
        }
    }
    
    for(int i = 0; i < days.size();)
    {
        x = 0;
        
        while(x + i < days.size() && days[i + x] <= days[i])
        {
            x++;
        }
        
        answer.push_back(x);
        i += x;
    }
    
    return answer;
}
