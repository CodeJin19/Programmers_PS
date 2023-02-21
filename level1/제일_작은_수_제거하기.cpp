#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> arr) {
    vector<int> answer;
    int min = 2100000000;
    int mdx;
    
    if(arr.size() == 1)
    {
        answer.push_back(-1);
    }
    else
    {
        for(int i = 0; i < arr.size(); i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
                mdx = i;
            }
        }
        
        for(int i = 0; i < arr.size(); i++)
        {
            if(i != mdx)
            {
                answer.push_back(arr[i]);
            }
        }
    }
    
    return answer;
}
