class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        if(a % 2 == 0) {
            if(b % 2 == 0) {
                answer = Math.abs(a - b);
            } else {
                answer = 2 * ( a + b);
            }
        } else {
            if(b % 2 == 0) {
                answer = 2 * ( a + b);
            } else {
                answer = a * a + b * b;
            }
        }
        
        return answer;
    }
}