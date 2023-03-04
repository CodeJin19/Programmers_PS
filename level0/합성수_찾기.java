class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] isPrime = new boolean[110];

        for(int i = 2; i < 110; i++) {
            isPrime[i] = true;
        }

        for(int i = 2; i < 110; i++) {
            if(!isPrime[i]) {
                continue;
            }

            for(int j = i + i; j < 110;) {
                isPrime[j] = false;
                j += i;
            }
        }

        for(int i = 2; i <= n; i++) {
            if(!isPrime[i]) {
                answer++;
            }
        }

        return answer;
    }
}