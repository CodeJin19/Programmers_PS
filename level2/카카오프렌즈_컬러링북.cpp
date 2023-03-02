#include <vector>

using namespace std;

int getArea(int i, int j, int val, vector<vector<int>> & picture, vector <vector <bool>> & visit)
{
    int ret = 1;
    visit[i][j] = true;
    
    if (0 <= i - 1 && !visit[i - 1][j] && picture[i - 1][j] == val)
        ret += getArea(i - 1, j, val, picture, visit);
    
    if (i + 1 < picture.size() && !visit[i + 1][j] && picture[i + 1][j] == val)
        ret += getArea(i + 1, j, val, picture, visit);
    
    if (0 <= j - 1 && !visit[i][j - 1] && picture[i][j - 1] == val)
        ret += getArea(i, j - 1, val, picture, visit);
    
    if (j + 1 < picture[0].size() && !visit[i][j + 1] && picture[i][j + 1] == val)
        ret += getArea(i, j + 1, val, picture, visit);
    
    return ret;
}

// 전역 변수를 정의할 경우 함수 내에 초기화 코드를 꼭 작성해주세요.
vector<int> solution(int m, int n, vector<vector<int>> picture) {
    vector <vector <bool>> visit;
    vector <bool>tmp;
    int number_of_area = 0;
    int max_size_of_one_area = 0;
    int area;

    for (int i = 0; i < picture[0].size(); i++)
        tmp.push_back(false);
    
    for (int i = 0; i < picture.size(); i++)
        visit.push_back(tmp);
    
    for (int i = 0; i < picture.size(); i++)
    {
        for (int j = 0; j < picture[i].size(); j++)
        {
            if(!visit[i][j] && picture[i][j] != 0)
            {
                area = getArea(i, j, picture[i][j], picture, visit);
                number_of_area++;
                
                if (max_size_of_one_area < area)
                    max_size_of_one_area = area;
            }
        }
    }
    
    vector<int> answer(2);
    answer[0] = number_of_area;
    answer[1] = max_size_of_one_area;
    return answer;
}
