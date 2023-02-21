#include <string>
#include <vector>

using namespace std;

string solution(int a, int b) {
    string answer = "";
    int idx = 1;
    int sum = 0;
    
    while(idx < a)
    {
        switch(idx)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                sum += 31;
                break;
            case 2:
                sum += 29;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                sum += 30;
                break;
        }
        
        idx++;
    }
    
    sum += b;
    
    switch(sum % 7)
    {
        case 1:
            answer.append("FRI");
            break;
        case 2:
            answer.append("SAT");
            break;
        case 3:
            answer.append("SUN");
            break;
        case 4:
            answer.append("MON");
            break;
        case 5:
            answer.append("TUE");
            break;
        case 6:
            answer.append("WED");
            break;
        case 0:
            answer.append("THU");
            break;
    }
    
    return answer;
}
