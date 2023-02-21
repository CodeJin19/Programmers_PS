#include <string>
#include <vector>

using namespace std;

int solution(vector<vector<int>> board, vector<int> moves) {
    int answer = 0;
    int len = moves.size();
    int n = board.size();
    int y, x, num;
    bool flag;
    vector <int> stck;
    
    for(int i = 0; i < len; ++i)
    {
        flag = false;
        x = moves[i] - 1;
        num = 0;
        
        for(y = 0; y < n; ++y)
        {
            if(board[y][x] != 0)
            {
                num = board[y][x];
                board[y][x] = 0;
                flag = true;
                break;
            }
        }
        
        if(flag)
        {
            if(stck.empty())
            {
                stck.push_back(num);
            }
            else
            {
                if(stck[stck.size() - 1] == num)
                {
                    stck.pop_back();
                    answer += 2;
                }
                else
                {
                    stck.push_back(num);
                }
            }
        }
    }
    
    return answer;
}
