import java.util.*;

class Solution {
    public int solution(String binomial) {
        StringTokenizer st = new StringTokenizer(binomial);
        int answer = 0;
        int num1 = Integer.parseInt(st.nextToken());
        char op = st.nextToken().charAt(0);
        int num2 = Integer.parseInt(st.nextToken());
        
        if(op == '+') {
            answer = num1 + num2;
        } else if(op == '-') {
            answer = num1 - num2;
        } else if(op == '*') {
            answer = num1 * num2;
        }
        
        return answer;
    }
}