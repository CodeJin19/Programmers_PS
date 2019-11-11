//[1차]_비밀지도

#include <string>
#include <vector>
#include <math.h>

using namespace std;

vector<string> solution(int n, vector<int> arr1, vector<int> arr2) {
    vector<string> answer;
    int num, x;
    string s1, s2, tmp;
    
    for(int i = 0; i < arr1.size(); i++)
    {
        s1.clear();
        x = pow(2, n - 1);
        num = arr1[i];
        
        while(num != 0)
        {
            if(1 <= num / x )
            {
                s1 += "1";
                num -= x;
            }
            else
            {
                s1 += "0";
            }
            
            x /= 2;
        }
        
        while(s1.length() != n)
        {
            s1 += "0";
        }
        
        
        s2.clear();
        x = pow(2, n - 1);
        num = arr2[i];
        
        while(num != 0)
        {
            if(1 <= num / x )
            {
                s2 += "1";
                num -= x;
            }
            else
            {
                s2 += "0";
            }
            
            x /= 2;
        }
        
        while(s2.length() != n)
        {
            s2 += "0";
        }
        
        
        tmp.clear();
        
        for(int j = 0; j < n; j++)
        {
            if(s1[j] == '1' || s2[j] == '1')
            {
                tmp += "#";
            }
            else
            {
                tmp += " ";
            }
        }
        
        answer.push_back(tmp);
    }
    
    return answer;
}
