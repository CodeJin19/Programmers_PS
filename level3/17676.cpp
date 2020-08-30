//[1차] 추석 트래픽

#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int solution(vector<string> lines) {
    int answer = 0;
    int n = lines.size();
    int h, m, s, cnt, x, idx = 0, time;
    bool flag;
    vector <vector <int>> timeline;
    vector <int> tmp;
    
    for(int i = 0; i < n; ++i)
    {
        idx++;
        
        x = 86400000;
        
        h = lines[i][11] - '0';
        h *= 10;
        h += lines[i][12] - '0';
        
        m = lines[i][14] - '0';
        m *= 10;
        m += lines[i][15] - '0';
        
        s = lines[i][17] - '0';
        s *= 10;
        s += lines[i][18] - '0';
        s *= 10;
        s += lines[i][20] - '0';
        s *= 10;
        s += lines[i][21] - '0';
        s *= 10;
        s += lines[i][22] - '0';
        
        time = h * 60 * 60 * 1000 + m * 60 * 1000 + s;
        
        x += time;
        
        tmp.clear();
        tmp.push_back(x);
        tmp.push_back(idx);
        tmp.push_back(1);
        timeline.push_back(tmp);
        
        time = 0;
        cnt = 4;
        
        for(int j = 24; j < lines[i].length() - 1; ++j)
        {
            if(j != 25)
            {
                time *= 10;
                time += (lines[i][j] - '0');
                cnt--;
            }
        }
        
        for(; 0 < cnt; --cnt)
        {
            time *= 10;
        }
        
        time--;
        x -= time;
        
        tmp.clear();
        tmp.push_back(x);
        tmp.push_back(idx);
        tmp.push_back(0);
        timeline.push_back(tmp);
    }
    
    sort(timeline.begin(), timeline.end());
    
    n *= 2;
    
    for(int i = 0; i < n; ++i)
    {
        if(timeline[i][2] == 0)
        {
            /*
            tmp.clear();
            cnt = 0;

            time = timeline[i][0];
            
            for(idx = 0; idx < n; ++idx)
            {
                if(time - 1000 < timeline[idx][0] && timeline[idx][0] <= time)
                {
                    flag = true;

                    for(int j = 0; j < cnt; ++j)
                    {
                        if(tmp[j] == timeline[idx][1])
                        {
                            flag = false;
                            break;
                        }
                    }

                    if(flag)
                    {
                        tmp.push_back(timeline[idx][1]);
                        cnt++;
                    }
                }
                else if(time - 3000 <= timeline[idx][0] && timeline[idx][0] <= time - 1000 && timeline[idx][2] == 0)
                {
                    for(int j = 0; j < n; ++j)
                    {
                        if(timeline[j][1] == timeline[idx][1] && time <= timeline[j][0] && timeline[j][0] <= time + 2000)
                        {
                            flag = true;
                            
                            for(int k = 0; k < cnt; ++k)
                            {
                                if(tmp[k] == timeline[j][1])
                                {
                                    flag = false;
                                    break;
                                }
                            }
                            
                            if(flag)
                            {
                                tmp.push_back(timeline[j][1]);
                                cnt++;
                            }
                        }
                    }
                }
            }
            
            if(answer < cnt)
            {
                answer = cnt;
            }
            
            tmp.clear();
            cnt = 0;

            time = timeline[i][0];
            
            for(idx = 0; idx < n; ++idx)
            {
                if(time <= timeline[idx][0] && timeline[idx][0] < time + 1000)
                {
                    flag = true;

                    for(int j = 0; j < cnt; ++j)
                    {
                        if(tmp[j] == timeline[idx][1])
                        {
                            flag = false;
                            break;
                        }
                    }

                    if(flag)
                    {
                        tmp.push_back(timeline[idx][1]);
                        cnt++;
                    }
                }
                else if(time - 2000 <= timeline[idx][0] && timeline[idx][0] < time && timeline[idx][2] == 0)
                {
                    for(int j = 0; j < n; ++j)
                    {
                        if(timeline[j][1] == timeline[idx][1] && time + 1000 <= timeline[j][0] && timeline[j][0] < time + 3000)
                        {
                            flag = true;
                            
                            for(int k = 0; k < cnt; ++k)
                            {
                                if(tmp[k] == timeline[j][1])
                                {
                                    flag = false;
                                    break;
                                }
                            }
                            
                            if(flag)
                            {
                                tmp.push_back(timeline[j][1]);
                                cnt++;
                            }
                        }
                    }
                }
            }
            
            if(answer < cnt)
            {
                answer = cnt;
            }
            */
        }
        else  //-------------------------------------------------------
        {
            /*
            tmp.clear();
            cnt = 0;

            time = timeline[i][0];
            
            for(idx = 0; idx < n; ++idx)
            {
                if(time - 1000 < timeline[idx][0] && timeline[idx][0] <= time)
                {
                    flag = true;

                    for(int j = 0; j < cnt; ++j)
                    {
                        if(tmp[j] == timeline[idx][1])
                        {
                            flag = false;
                            break;
                        }
                    }

                    if(flag)
                    {
                        tmp.push_back(timeline[idx][1]);
                        cnt++;
                    }
                }
                else if(time - 3000 < timeline[idx][0] && timeline[idx][0] <= time - 1000 && timeline[idx][2] == 0)
                {
                    for(int j = 0; j < n; ++j)
                    {
                        if(timeline[j][1] == timeline[idx][1] && time < timeline[j][0] && timeline[j][0] <= time + 2000)
                        {
                            flag = true;
                            
                            for(int k = 0; k < cnt; ++k)
                            {
                                if(tmp[k] == timeline[j][1])
                                {
                                    flag = false;
                                    break;
                                }
                            }
                            
                            if(flag)
                            {
                                tmp.push_back(timeline[j][1]);
                                cnt++;
                            }
                        }
                    }
                }
            }
            
            if(answer < cnt)
            {
                answer = cnt;
            }
            */
            tmp.clear();
            cnt = 0;

            time = timeline[i][0];
            
            for(idx = 0; idx < n; ++idx)
            {
                if(time <= timeline[idx][0] && timeline[idx][0] < time + 1000)
                {
                    flag = true;

                    for(int j = 0; j < cnt; ++j)
                    {
                        if(tmp[j] == timeline[idx][1])
                        {
                            flag = false;
                            break;
                        }
                    }

                    if(flag)
                    {
                        tmp.push_back(timeline[idx][1]);
                        cnt++;
                    }
                }
                else if(time - 2000 <= timeline[idx][0] && timeline[idx][0] < time && timeline[idx][2] == 0)
                {
                    for(int j = 0; j < n; ++j)
                    {
                        if(timeline[j][1] == timeline[idx][1] && time + 1000 <= timeline[j][0] && timeline[j][0] < time + 3000)
                        {
                            flag = true;
                            
                            for(int k = 0; k < cnt; ++k)
                            {
                                if(tmp[k] == timeline[j][1])
                                {
                                    flag = false;
                                    break;
                                }
                            }
                            
                            if(flag)
                            {
                                tmp.push_back(timeline[j][1]);
                                cnt++;
                            }
                        }
                    }
                }
            }
            
            if(answer < cnt)
            {
                answer = cnt;
            }
        }
    }
    
    return answer;
}
