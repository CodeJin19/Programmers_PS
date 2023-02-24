class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int num = 0;
        int len = my_string.length();
        final int ADD = 1;
        final int SUBTRACT = 2;
        int operation = ADD;
        boolean isNum = false;

        for(int i = 0; i < len; i++) {
            if(isNum) {
                if('0' <= my_string.charAt(i) && my_string.charAt(i) <= '9') {
                    num *= 10;
                    num += (int) (my_string.charAt(i) - '0');
                } else {
                    if(operation == ADD) {
                        answer += num;
                    } else {
                        answer -= num;
                    }
                    
                    num = 0;
                    isNum = false;
                }
            } else if('0' <= my_string.charAt(i) && my_string.charAt(i) <= '9'){
                isNum = true;
                
                num *= 10;
                num += (int) (my_string.charAt(i) - '0');
            } else if(my_string.charAt(i) == ' ') {
                continue;
            } else {
                if(my_string.charAt(i) == '+') {
                    operation = ADD;
                } else if(my_string.charAt(i) == '-') {
                    operation = SUBTRACT;
                }
            }
        }
        
        if(operation == ADD) {
            answer += num;
        } else {
            answer -= num;
        }

        return answer;
    }
}