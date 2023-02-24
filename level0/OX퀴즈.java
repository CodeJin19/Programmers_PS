class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int idx, len, num1, num2, ans;
        boolean isNumMin, addFlag;
        
        for(int i = 0; i < quiz.length; i++) {
            len = quiz[i].length();
            idx = 0;
            num1 = 0;
            num2 = 0;
            ans = 0;
            addFlag = false;
            isNumMin = false;
            
            if(quiz[i].charAt(idx) == '-') {
                isNumMin = true;
                idx++;
            }
            
            while(quiz[i].charAt(idx) != ' ') {
                num1 *= 10;
                num1 += (int) (quiz[i].charAt(idx) - '0');
                idx++;
            }
            
            if(isNumMin) {
                num1 = 0 - num1;
                isNumMin = false;
            }
            
            idx++;
            
            if(quiz[i].charAt(idx) == '+')
                addFlag = true;
            
            idx++;
            idx++;
            
            if(quiz[i].charAt(idx) == '-') {
                isNumMin = true;
                idx++;
            }

            while(quiz[i].charAt(idx) != ' ') {
                num2 *= 10;
                num2 += (int) (quiz[i].charAt(idx) - '0');
                idx++;
            }
            
            if(isNumMin) {
                num2 = 0 - num2;
                isNumMin = false;
            }
            
            idx++;
            idx++;
            idx++;

            if(quiz[i].charAt(idx) == '-') {
                isNumMin = true;
                idx++;
            }

            while(idx < len) {
                ans *= 10;
                ans += (int) (quiz[i].charAt(idx) - '0');
                idx++;
            }

            if(isNumMin) {
                ans = 0 - ans;
                isNumMin = false;
            }
            
            if(addFlag) {
                if(num1 + num2 == ans) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else {
                if(num1 - num2 == ans) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }
}