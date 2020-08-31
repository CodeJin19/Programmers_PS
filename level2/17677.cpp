// [1차] 뉴스 클러스터링

#include <string>
#include <vector>
#include <utility>

using namespace std;

int solution(string str1, string str2) {
    string tmp;
    vector <pair <string, int>> str1List, str2List;
    double ans;
    int answer = 0;
    int len, idx, str1Size = 0, str2Size = 0, interset, unionset;
    bool flag;
    
    len = str1.length();

    for (int i = 0; i < len - 1; i++)
    {
        tmp = str1.substr(i, 2);

        if ('A' <= tmp[0] && tmp[0] <= 'Z')
        {
            tmp[0] -= 'A';
            tmp[0] += 'a';
        }
        
        if ('a' <= tmp[0] && tmp[0] <= 'z')
        {
            if ('A' <= tmp[1] && tmp[1] <= 'Z')
            {
                tmp[1] -= 'A';
                tmp[1] += 'a';
            }

            if ('a' <= tmp[1] && tmp[1] <= 'z')
            {
                flag = true;

                for (int j = 0; j < str1Size; ++j)
                {
                    if (tmp.compare(str1List[j].first) == 0)
                    {
                        idx = j;
                        flag = false;
                        break;
                    }
                }

                if (flag)
                {
                    str1List.push_back(make_pair(tmp, 1));
                    str1Size++;
                }
                else
                {
                    str1List[idx].second += 1;
                }
            }
        }
    }

    len = str2.length();

    for (int i = 0; i < len - 1; i++)
    {
        tmp = str2.substr(i, 2);

        if ('A' <= tmp[0] && tmp[0] <= 'Z')
        {
            tmp[0] -= 'A';
            tmp[0] += 'a';
        }

        if ('a' <= tmp[0] && tmp[0] <= 'z')
        {
            if ('A' <= tmp[1] && tmp[1] <= 'Z')
            {
                tmp[1] -= 'A';
                tmp[1] += 'a';
            }

            if ('a' <= tmp[1] && tmp[1] <= 'z')
            {
                flag = true;

                for (int j = 0; j < str2Size; ++j)
                {
                    if (tmp.compare(str2List[j].first) == 0)
                    {
                        idx = j;
                        flag = false;
                        break;
                    }
                }

                if (flag)
                {
                    str2List.push_back(make_pair(tmp, 1));
                    str2Size++;
                }
                else
                {
                    str2List[idx].second += 1;
                }
            }
        }
    }

    if (str1Size == 0)
    {
        if (str2Size == 0)
        {
            answer = 65536;
        }
        else
        {
            answer = 0;
        }
    }
    else
    {
        if (str2Size == 0)
        {
            answer = 0;
        }
        else
        {
            interset = 0;

            for (int i = 0; i < str1Size; ++i)
            {
                for (int j = 0; j < str2Size; ++j)
                {
                    if (str1List[i].first.compare(str2List[j].first) == 0)
                    {
                        interset += min(str1List[i].second, str2List[j].second);
                    }
                }
            }

            unionset = 0;

            for (int i = 0; i < str1Size; ++i)
            {
                unionset += str1List[i].second;
            }

            for (int i = 0; i < str2Size; ++i)
            {
                unionset += str2List[i].second;
            }

            unionset -= interset;

            ans = interset;
            ans /= unionset;
            answer = (int)(ans * 65536);
        }
    }
    
    return answer;
}
