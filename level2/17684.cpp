//[3차] 압축

#include <string>
#include <vector>
#include <map>

using namespace std;

vector<int> solution(string msg) {
    vector<int> answer;
    map <string, int> list;
    map <string, int>::iterator it;
    int idx = 1, len = msg.length();
    string x;
    
    for(int i = 0; i < 26; ++i)
    {
        x = 'A' + i;
        list.insert(make_pair(x, idx));
        idx++;
    }
    
    for(int i = 0; i < len; ++i)
    {
        for(int j = len - i; 0 < j; --j)
        {
            x = msg.substr(i, j);
            it = list.find(x);
            
            if(it != list.end())
            {
                answer.push_back(it->second);
                x += msg[i + j];
                list.insert(make_pair(x, idx));
                idx++;
                i += (j - 1);
                break;
            }
        }
    }
    
    return answer;
}
