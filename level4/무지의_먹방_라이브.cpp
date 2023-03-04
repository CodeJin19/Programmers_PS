#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int solution(vector<int> food_times, long long k) {
    vector <pair <int, int>> list;
    int len = food_times.size();
    int total = food_times.size();
    long long time = 0;
    int cnt = 0;
    int idx = 0;
    bool flag = false;
    
    for(int i = 0; i < len; ++i)
    {
        list.push_back(make_pair(food_times[i], i));
    }
    
    sort(list.begin(), list.end());
    
    while(time + total <= k)
    {
        time += total;
        cnt++;
        
        while(idx < len && list[idx].first == cnt)
        {
            ++idx;
            total--;
        }
        
        if(idx == len)
        {
            flag = true;
            break;
        }
    }
    
    if(flag)
    {
        return -1;
    }
    else if(time == k)
    {
        
        for(int i = 0; i < len; ++i)
        {
            if(cnt < food_times[i])
            {
                return (i + 1);
            }
        }
    }
    else
    {
        for(int i = 0; i < len; ++i)
        {
            if(cnt < food_times[i])
            {
                time++;
                
                if(time == k + 1)
                {
                    return (i + 1);
                }
            }
        }
    }
}
