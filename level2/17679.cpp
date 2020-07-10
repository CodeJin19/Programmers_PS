#include <string>
#include <vector>

using namespace std;

int solution(int m, int n, vector<string> board) {
    int answer = 0, idx;
    bool isMovable;
    vector <vector <int>> add;
    vector <int> tmp;
    
    do
    {
        add.clear();
        tmp.clear();
        
        for(int i = 0; i < board.size() - 1; i++)
        {
            for(int j = 0; j < board[i].length() - 1; j++)
            {
                if(board[i][j] != 'X' && board[i][j] == board[i][j + 1] && board[i][j] == board[i + 1][j] && board[i][j] == board[i + 1][j + 1])
                {
                    tmp.push_back(i);
                    tmp.push_back(j);
                    add.push_back(tmp);
                    tmp.clear();
                }
            }
        }

        for(int i = 0; i < add.size(); i++)
        {
            if(board[add[i][0]][add[i][1]] != 'X')
                answer++;
            board[add[i][0]][add[i][1]] = 'X';
            
            if(board[add[i][0] + 1][add[i][1]] != 'X')
                answer++;
            board[add[i][0] + 1][add[i][1]] = 'X';
            
            if(board[add[i][0]][add[i][1] + 1] != 'X')
                answer++;
            board[add[i][0]][add[i][1] + 1] = 'X';
            
            if(board[add[i][0] + 1][add[i][1] + 1] != 'X')
                answer++;
            board[add[i][0] + 1][add[i][1] + 1] = 'X';
        }
        
        if(add.size() != NULL)
        {
            for(int i = 0; i < n; i++)
            {
                isMovable = false;

                for(int j = m - 1; 0 <= j; j--)
                {
                    if(board[j][i] == 'X' && !isMovable)
                    {
                        isMovable = true;
                        idx = j;
                    }

                    if(board[j][i] != 'X' && isMovable)
                    {
                        board[idx][i] = board[j][i];
                        board[j][i] = 'X';
                        idx--;
                    }
                }
            }
        }
    }
    while(add.size() != NULL);
    
    return answer;
}
