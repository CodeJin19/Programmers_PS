//탑

#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> heights) {
    vector<int> answer;
    int idx;
    bool flag;
    
    for(int i = 0; i < heights.size(); i++)
    {
        idx = i - 1;
        flag = true;
        
        while(0 <= idx)
        {
            if(heights[i] <heights[idx])
            {
                flag = false;
                break;
            }
            
            idx--;
        }
        
        if(flag)
        {
            answer.push_back(0);
        }
        else
        {
            answer.push_back(idx + 1);
        }
    }
    
    return answer;
}
