//문자열_내림차순으로_

#include <string>
#include <vector>
#include <algorithm>

using namespace std;

string solution(string s) {
    string answer = "";
    vector <int> arr;
    char x;
    
    for(int i = 0; i < s.length(); i++)
    {
        arr.push_back((int) s[i]);
    }
    
    sort(arr.begin(), arr.end());
    
    for(int i = arr.size() - 1; 0 <= i ; i--)
    {
        x = (char) arr[i];
        answer += (x);
    }
    
    return answer;
}
