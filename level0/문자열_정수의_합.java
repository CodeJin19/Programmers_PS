class Solution {
    public int solution(String num_str) {
        int answer = 0;
        int len = num_str.length();
        
        for(int i = 0; i < len; i++) {
            int num = num_str.charAt(i) - '0';
            answer += num;
        }
        
        return answer;
    }
}