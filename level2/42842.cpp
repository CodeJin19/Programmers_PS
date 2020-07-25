//카펫

#include <string>
#include <vector>

using namespace std;

vector<int> solution(int brown, int yellow) {
    vector<int> answer;
    int x;
    
    if(yellow == 1)
    {
        answer.push_back(3);
        answer.push_back(3);
    }
    else
    {
        for(int i = 1; i <= yellow / 2; ++ i)
        {
            if (yellow % i == 0)
            {
                x = yellow / i;

                if ((x + 2) * (i + 2) == yellow + brown)
                {
                    answer.push_back((x + 2));
                    answer.push_back((i + 2));
                    i = yellow;
                }
            }
        }
    }
    
    return answer;
}
