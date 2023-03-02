import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int cnt = 0;
        int len = my_string.length();

        for(int i = 0; i < len; i++) {
            if('0' <= my_string.charAt(i) && my_string.charAt(i) <= '9') {
                cnt++;
            }
        }

        int[] answer = new int[cnt];
        int idx = 0;

        for(int i = 0; i < len; i++) {
            if('0' <= my_string.charAt(i) && my_string.charAt(i) <= '9') {
                answer[idx++] = (int)(my_string.charAt(i) - '0');
            }
        }

        Arrays.sort(answer);

        return answer;
    }
}