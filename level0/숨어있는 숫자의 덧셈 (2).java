class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int len = my_string.length();
        boolean flag = false;
        int tmpNum = 0;

        for(int i = 0; i < len; i++) {
            if(flag) {
                if('0' <= my_string.charAt(i) && my_string.charAt(i) <= '9') {
                    tmpNum *= 10;
                    tmpNum += (int) (my_string.charAt(i) - '0');
                } else {
                    flag = false;
                    answer += tmpNum;
                    tmpNum = 0;
                }
            } else if('0' <= my_string.charAt(i) && my_string.charAt(i) <= '9'){
                flag = true;
                tmpNum *= 10;
                tmpNum += (int) (my_string.charAt(i) - '0');
            }
        }

        answer += tmpNum;
        
        return answer;
    }
}