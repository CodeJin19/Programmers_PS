class Solution {
    public long solution(int n) {
        long answer = 0;

        if(n == 1) {
            answer = 1;
        } else if(n == 2) {
            answer = 2;
        } else {
            long pp = 1;
            long p = 2;
            for(int i = 3; i <= n;i++) {
                answer = p + pp;
                answer %= 1234567;
                pp = p;
                p = answer;
            }
        }

        return answer;
    }
}