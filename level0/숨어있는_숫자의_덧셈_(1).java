class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int len = my_string.length();

        for(int i = 0; i < len; i++) {
            if('a' <= my_string.charAt(i) && my_string.charAt(i) <= 'z') {
                continue;
            } else if('A' <= my_string.charAt(i) && my_string.charAt(i) <= 'Z') {
                continue;
            } else {
                answer += (int) (my_string.charAt(i) - '0');
            }
        }
        
        return answer;
    }
}