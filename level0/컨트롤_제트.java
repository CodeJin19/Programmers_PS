import java.util.Stack;

class Solution {
    public int solution(String s) {
        Stack <Integer> stck = new Stack<Integer>();
        int answer = 0;
        int len = s.length();
        int num;
        boolean isNeg = false;

        for(int i = 0; i < len; i++) {
            if(s.charAt(i) == ' ') {

            } else if(s.charAt(i) == 'Z') {
                stck.pop();
            } else {
                num = 0;
                
                if(s.charAt(i) == '-') {
                    isNeg = true;
                    i++;
                }

                while(i < len && '0' <= s.charAt(i) && s.charAt(i) <= '9') {
                    num *= 10;
                    num += (int) (s.charAt(i) - '0');
                    i++;
                }

                if(isNeg) {
                    num = 0 - num;
                    isNeg = false;
                }
                
                stck.push(num);
                i--;
            }
        }

        while(!stck.isEmpty()) {
            answer += stck.pop();
        }

        return answer;
    }
}