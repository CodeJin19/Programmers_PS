//[1차] 

#include <string>
#include <vector>

using namespace std;

int solution(int cacheSize, vector<string> cities) {
    vector <string> cache;
    int answer = 0, len = cities.size(), l;
    bool isHit, isFull;
    
    if(cacheSize == 0)
    {
        return cities.size() * 5;
    }
    else
    {
        isFull = false;
    }
    
    for(int i = 0; i < len; ++i)
    {
        l = cities[i].length();
        
        for(int j = 0; j < l; ++j)
        {
            if('A' <= cities[i][j] && cities[i][j] <= 'Z')
            {
                cities[i][j] = (char) (cities[i][j] - 'A' + 'a');
            }
        }
        
        isHit = false;
        l = cache.size();
        
        for(int j = l - 1; 0 <= j; --j)
        {
            if(cities[i].compare(cache[j]) == 0)
            {
                for(int k = j + 1; k < l; ++k)
                {
                    cache[k - 1] = cache[k];
                }

                cache[l - 1] = cities[i];

                answer += 1;
                isHit = true;
            }
        }
        
        if(!isHit)
        {
            if(isFull)
            {
                for(int j = 1; j < cacheSize; ++j)
                {
                    cache[j - 1] = cache[j];
                }
                
                cache[cacheSize - 1] = cities[i];
            }
            else
            {
                cache.push_back(cities[i]);
                
                if(cache.size() == cacheSize)
                {
                    isFull = true;
                }
            }
            answer += 5;
        }
    }
    
    return answer;
}
