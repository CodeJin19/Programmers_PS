#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<string> solution(vector<string> strings, int n) {
    vector<string> answer;
    vector<string> sub;
    vector<int> arr;
    int cnt;
    int idx;
    string min;
    
    for(int i = 0; i < strings.size(); i++)
    {
        arr.push_back(strings[i][n]);
    }
    
    sort(arr.begin(), arr.end());
    
    for(int i = 0; i < strings.size(); i++)
    {
        cnt = 0;
        
        while(arr[i] == arr[i + cnt])
        {
            cnt++;
        }
        
        if(cnt != 1)
        {
            sub.clear();

            for(int j = 0; j < strings.size(); j++)
            {
                if(arr[i] == (int) strings[j][n])
                {
                    sub.push_back(strings[j]);
                }
            }
            
            while(sub.size() != 1)
            {
                min = sub[0];
                
                for(int j = 1; j < sub.size(); j++)
                {
                    if(0 < min.compare(sub[j]))
                    {
                        min = sub[j];
                        idx = j;
                    }
                }
                
                answer.push_back(min);
                
                if(min == sub[0])
                {
                    sub.erase(sub.begin());
                }
                else
                {
                    sub.erase(sub.begin() + idx);
                }
            }
            
            answer.push_back(sub[0]);
            
            i += cnt;
            i--;
        }
        else
        {
            for(int j = 0; j < strings.size(); j++)
            {
                if(arr[i] == (int) strings[j][n])
                {
                    answer.push_back(strings[j]);
                    break;
                }
            }
        }
    }
    
    return answer;
}
