class Solution {
    public int solution(int n) {
        int answer = 0;

        if(n == 1) {
            answer = 1;
        } else if(n == 2) {
            answer = 2;
        } else {
            int pp = 1;
            int p = 2;
            
            for(int i = 3; i <= n; i++) {
                answer = p + pp;
                answer %= 1000000007;
                
                pp = p;
                p = answer;
            }
        }

        return answer;
    }
}