//행렬의_덧셈

#include <string>
#include <vector>

using namespace std;

vector<vector<int>> solution(vector<vector<int>> arr1, vector<vector<int>> arr2) {
    vector<vector<int>> answer;
    vector <int> x;
    int n;
    
    for(int i = 0; i < arr1.size(); i++)
    {
        x.clear();
        
        for(int j = 0; j < arr1[i].size(); j++)
        {
            n = arr1[i][j] + arr2[i][j];
            x.push_back(n);
        }
        
        answer.push_back(x);
    }
    
    
    return answer;
}
