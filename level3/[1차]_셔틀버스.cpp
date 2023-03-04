#include <string>
#include <vector>
#include <algorithm>

using namespace std;

string solution(int n, int t, int m, vector<string> timetable) {
    vector <vector <int>> listForCar;
    vector <int> list;
    vector <int> cnt;
    vector <int> tmp;
    
    int len = timetable.size(), hour, minute, now, idx, ans;
    string answer = "";
    
    for(int i = 0; i < len; ++i)
    {
        hour = (int) (timetable[i][0] - '0');
        hour *= 10;
        hour += (int) (timetable[i][1] - '0');
        
        minute = (int) (timetable[i][3] - '0');
        minute *= 10;
        minute += (int) (timetable[i][4] - '0');
        
        minute += (hour * 60);
        list.push_back(minute);
    }
    
    sort(list.begin(), list.end());
    
    now = 9 * 60;
    idx = 0;
    
    for(int i = 0; i < n; ++i)
    {
        cnt.push_back(0);
        tmp.clear();
        
        while(idx < len && list[idx] <= now && cnt[i] < m)
        {
            tmp.push_back(list[idx]);
            idx++;
            cnt[i] += 1;
        }
        
        now += t;
        listForCar.push_back(tmp);
    }
    
    now -= t;
    
    if(cnt[n - 1] < m)
    {
        ans = now;
    }
    else
    {
        ans = listForCar[n - 1][listForCar[n - 1].size() - 1] - 1;
    }
    
    minute = ans % 60;
    ans -= minute;
    hour = ans / 60;
    
    if(hour < 10)
    {
        answer = "0";
    }
    else
    {
        answer = "1";
    }
    
    answer += (char) ((hour % 10) + '0');
    
    if(minute < 10)
    {
        answer += ":0";
    }
    else
    {
        answer += ":";
        answer += (char) ((int) (minute / 10) + '0');
    }
    
    answer += (char) ((minute % 10) + '0');
    
    return answer;
}
