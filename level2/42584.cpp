//주식가격

#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> prices) {
    vector<int> answer;
    int cnt;
    
    for(int i = 0; i < prices.size(); i++)
    {
        cnt = 0;
        
        while(i + cnt < prices.size() && prices[i] <= prices[i + cnt])
        {
            cnt++;
        }
        
        if (i + cnt < prices.size())
            answer.push_back(cnt);
        else
            answer.push_back(cnt - 1);
    }
    
    return answer;
}
