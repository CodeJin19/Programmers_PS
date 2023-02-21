#include <string>
#include <vector>
#include <iostream>

using namespace std;

int solution(int n) {
    int answer = 1;
    int x;
    bool arr[1000010];
    
    for(int i = 3; i <= n; i++)
    {
        arr[i] = true;
    }
    
    for(int i = 3; i <= n;)
    {
        x = 0;
        
        if(arr[i])
        {
            answer++;
            
            while(x <= n && x <= (1000010 - i))
            {
                x += i;
                arr[x] = false;
            }
        }
        
        i += 2;
    }
    
    return answer;
}
