class Solution {
    public int solution(int n) {
        int answer = 0;
        double sqrt = Math.sqrt(n);
        
        for(int i = 1; i < sqrt; i++) {
            if(n % i == 0) {
                answer++;
            }
        }
        
        answer *= 2;
        
        int x = (int) sqrt;
        
        if(x * x == n) {
            answer++;
        }
        
        return answer;
    }
}