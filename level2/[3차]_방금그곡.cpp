#include <string>
#include <vector>

using namespace std;

string solution(string s, vector<string> musicinfos) {
    vector <string> answer;
    vector <int> playLength;
    string str, title, lyric, target;
    int limit = musicinfos.size(), len, start, end, h, m, d, idx, max = -1;
    
    len = s.length();
    target = "";
    idx = 0;
    
    for(int i = 0; i < len; ++i)
    {
        if(s[i] == '#')
        {
            target[idx - 1] = (char) (target[idx - 1] - 'A' + 'a');
        }
        else
        {
            target += s[i];
            idx++;
        }
    }
    
    for(int i = 0; i < limit; ++i)
    {
        h = musicinfos[i][0] - '0';
        h *= 10;
        h += (int) (musicinfos[i][1] - '0');
        
        m = musicinfos[i][3] - '0';
        m *= 10;
        m += (int) (musicinfos[i][4] - '0');
        
        start = h * 60 + m;
        
        h = musicinfos[i][6] - '0';
        h *= 10;
        h += (int) (musicinfos[i][7] - '0');
        
        m = musicinfos[i][9] - '0';
        m *= 10;
        m += (int) (musicinfos[i][10] - '0');
        
        end = h * 60 + m;
        d = end - start;
        
        title = musicinfos[i].substr(12, (musicinfos[i].find(",", 12) - 12));
        
        len = musicinfos[i].length();
        lyric = "";
        idx = 0;
        
        for(int j = musicinfos[i].find(",", 12) + 1; j < len; ++j)
        {
            if(musicinfos[i][j] == '#')
            {
                lyric[idx - 1] = (char) (lyric[idx - 1] - 'A' + 'a');
            }
            else
            {
                lyric += musicinfos[i][j];
                idx++;
            }
        }
        
        idx = 0;
        len = lyric.length();
        str = "";
        
        while(idx <= d && idx + len <= d)
        {
            str += lyric;
            idx += len;
        }
        
        str += lyric.substr(0, d - idx);
        
        if(str.find(target) != string::npos)
        {
            answer.push_back(title);
            playLength.push_back(d);
            
            if(max < d)
            {
                max = d;
            }
        }
    }
    
    len = answer.size();
    idx = 0;
    
    for(int i = len - 1; 0 <= i; --i)
    {
        if(max == playLength[i])
        {
            idx = i;
        }
    }
    
    if(len == 0)
    {
        return "(None)";
    }
    else
    {
        return answer[idx];
    }
}
