//예산

#include <iostream>
#include <stdio.h>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int solution(vector<int> d, int budget) {
    int answer = 0;
    int idx = 0;
    
    sort(d.begin(), d.end());
    
    while(0 < budget && idx < d.size())
    {
        budget -= d[idx];
        
        if(0 <= budget)
        {
            answer++;
        }
        
        idx++;
    }
    
    return answer;
}
