class Solution {
    public int solution(String number) {
        int len = number.length();
        int answer = 0;
        
        for(int i = 0; i < len; i++) {
            answer += (int)(number.charAt(i) - '0');
        }
        
        return answer % 9;
    }
}