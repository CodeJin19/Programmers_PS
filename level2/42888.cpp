//오픈채팅방

#include <string>
#include <vector>
#include <map>

using namespace std;

vector<string> solution(vector<string> record) {
    vector<string> answer;
    vector<string> tmp;
    map<string, string> list;
    string uid, name;
    int len = record.size();
    
    for(int i = 0; i < len; ++i)
    {
        switch(record[i][0])
        {
            case 'E':
                uid = record[i].substr(6, (record[i].find(" ", 6) - 6));
                
                if(list.find(uid) == list.end())
                {
                    list.insert(make_pair(uid, record[i].substr(record[i].find(" ", 6) + 1)));
                }
                else
                {
                    list.find(uid)->second = record[i].substr(record[i].find(" ", 6) + 1);
                }
                
                answer.push_back("님이 들어왔습니다.");
                tmp.push_back(uid);
                break;
                
            case 'L':
                uid = record[i].substr(6, (record[i].find(" ", 6) - 6));
                answer.push_back("님이 나갔습니다.");
                tmp.push_back(uid);
                break;
                
            case 'C':
                uid = record[i].substr(7, (record[i].find(" ", 7) - 7));
                list.find(uid)->second = record[i].substr(record[i].find(" ", 7) + 1);
                break;
        }
    }
    
    len = answer.size();
    
    for(int i = 0; i < len; ++i)
    {
        answer[i] = list.find(tmp[i])->second + answer[i];
    }
    
    return answer;
}
