#include <string>
#include <vector>
#include <map>
#include <algorithm>

using namespace std;

vector <string> ans;

bool isKey(vector <bool> col, vector <vector <string>> & relation)
{
    map <string, int> list;
    string str;
    int len = relation.size(), colLen = col.size();
    
    for(int i = 0; i < len; ++i)
    {
        str = "";
        
        for(int j = 0; j < colLen; ++j)
        {
            if(col[j])
            {
                str += relation[i][j];
            }
        }
        
        if(list.find(str) == list.end())
        {
            list.insert(make_pair(str, 0));
        }
        else
        {
            return false;
        }
    }
    
    len = col.size();
    str = "";
    
    for(int i = 0; i < len; ++i)
    {
        if(col[i])
        {
            str += (char)('A' + i);
        }
    }
    
    ans.push_back(str);
    
    return true;
}

void solve(int idx, vector <int> tmp, vector <vector <string>> & relation)
{
    if(tmp.size() < idx)
    {
        return;
    }
    
    vector <bool> col;
    int len = tmp.size();
    int ret = 0;
    
    for(int i = 0; i < len; ++i)
    {
        if(tmp[i] == 1)
        {
            col.push_back(true);
        }
        else
        {
            col.push_back(false);
        }
    }
    
    if(isKey(col, relation))
    {
        return;
    }
    
    for(int i = idx + 1; i < len; ++i)
    {
        if(tmp[i] == 0)
        {
            tmp[i] = 1;
            solve(i, tmp, relation);
            tmp[i] = 0;
        }
    }
    
    return;
}

int solution(vector<vector<string>> relation) {
    vector <bool> tmp;
    vector <int> col;
    int answer = 0;
    int len = relation[0].size();
    int idx, jdx, l;
    bool flag;
    
    for(int i = 0; i < len; ++i)
    {
        tmp.push_back(false);
        col.push_back(0);
    }
    
    for(int i = 0; i < len; ++i)
    {
        tmp[i] = true;
        
        if(isKey(tmp, relation))
        {
            col[i] = -1;
        }
        
        tmp[i] = false;
    }
    
    for(int i = 0; i < len; ++i)
    {
        if(col[i] != -1)
        {
            col[i] = 1;
            solve(i, col, relation);
            col[i] = 0;
        }
    }
    
    sort(ans.begin(), ans.end());
    answer = ans.size();
    len = ans.size();
    
    for(int i = 0; i < len; ++i)
    {
        if(ans[i].compare("Z") != 0)
        {
            for(int j = 0; j < len; ++j)
            {
                if(j != i)
                {
                    l = ans[i].length();
                    flag = true;

                    for(idx = 0; idx < l; ++idx)
                    {
                        if(ans[j].find(ans[i][idx]) == string::npos)
                        {
                            flag = false;
                            break;
                        }
                    }
                    
                    if(flag)
                    {
                        ans[j] = "Z";
                        answer--;
                    }
                }
            }
        }
    }
    
    return answer;
}
