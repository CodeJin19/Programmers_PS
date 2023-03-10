#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int solution(vector<int> A, vector<int> B) {
    int answer = 0;
    int adx = A.size() - 1;
    int bdx = B.size() - 1;
    
    sort(A.begin(), A.end());
    sort(B.begin(), B.end());
    
    while(0 <= bdx && 0 <= adx)
    {   
        if(A[adx] < B[bdx])
        {
            answer++;
            bdx--;
            adx--;
        }
        else
        {
            while(B[bdx] <= A[adx] && 0 <= adx && 0 <= bdx)
            {
                adx--;
            }
            
            if(0 <= adx)
            {
                answer++;
                bdx--;
                adx--;
            }
        }
    }
    
    return answer;
}