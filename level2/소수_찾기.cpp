#include <string>
#include <vector>
#include <math.h>
#include <iostream>

using namespace std;

vector <int> list;
vector <bool> prime;
vector <bool> cache;

int combinate(int len, int num, int idx)
{
    if(idx == len)
    {
        if(prime[num])
        {
            prime[num] = false;
            return 1;
        }
    }
    
    int ret = 0;
    
    for(int i = 0; i < list.size(); i++)
    {
        if(!cache[i])
        {
            num *= 10;
            num += list[i];
            cache[i] = true;
            
            ret += combinate(len, num, idx + 1);
            
            num /= 10;
            cache[i] = false;
        }
    }
    
    return ret;
}

int solution(string numbers) {
    int answer = 0;
    int x, limit;
    
    for(int i = 0; i < numbers.length(); i++)
    {
        x = numbers[i] - '0';
        list.push_back(x);
        cache.push_back(false);
    }
    
    limit = pow(10, numbers.length());
    
    for(int i = 0; i < limit; i++)
        prime.push_back(true);
    
    prime[0] = false;
    prime[1] = false;
    
    for(int i = 2; i < limit; i++)
    {
        if(prime[i])
            for (int j = i + i; j < limit; j += i)
                prime[j] = false;
    }
    
    for (int i = numbers.length(); 0 < i; i--)
    {
        answer += combinate(i, 0, 0);
    }
    
    return answer;
}
