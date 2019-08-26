//같은_숫자는_싫어

#include <vector>
#include <iostream>

using namespace std;

vector<int> solution(vector<int> arr) 
{
    vector<int> answer;
    int idx, num;
    
    for(int i = 0; i < arr.size();)
    {
        idx = 0;
        num = arr[i];
        
        while(arr[i + idx] == num && (i + idx) < arr.size())
        {
            idx++;
        }
        
        answer.push_back(num);
        i += idx;
    }

    return answer;
}
