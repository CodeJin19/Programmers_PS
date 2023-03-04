#include <string>
#include <vector>

using namespace std;

int solution(string dartResult) {
    int answer = 0;
    int len = dartResult.length();
    int num, idx = -1;
    vector <int> score;

    for(int i = 0; i < len; )
    {
        if (dartResult[i] == '1' && dartResult[i + 1] == '0')
        {
            num = 10;
            i++;
        }
        else
        {
            num = (int) (dartResult[i] - '0');
        }
        
        switch(dartResult[i + 1])
        {
            case 'S':
                break;
            case 'D':
                num *= num;
                break;
            case 'T':
                num = num * num * num;
                break;
        }
        
        score.push_back(num);
        idx++;
        
        if(i + 2 < len)
        {
            if (dartResult[i + 2] == '*')
            {
                i++;
                score[idx] *= 2;
                
                if(0 <= idx - 1)
                    score[idx - 1] *= 2;
            }
            
            if (dartResult[i + 2] == '#')
            {
                i++;
                score[idx] *= (-1);
            }
        }
        
        i += 2;
    }
    
    for(int i = 0; i <= idx; ++i)
        answer += score[i];
    
    return answer;
}
