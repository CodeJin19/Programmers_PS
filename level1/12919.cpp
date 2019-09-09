//서울에서_김서방_찾기

#include <string>
#include <vector>

using namespace std;

string solution(vector<string> seoul) {
    string answer = "";
    
    for(int i = 0; i < seoul.size(); i++)
    {
        if(seoul[i][0] == 'K' && seoul[i][1] == 'i' && seoul[i][2] == 'm' && seoul[i].size() == 3)
        {
            answer += "김서방은 ";
            answer += to_string(i);
            answer += "에 있다";
        }
    }
    
    return answer;
}
