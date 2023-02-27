class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while(a <= n) {
            int r = n % a;
            int x = n / a;

            answer += x * b;

            n = x * b + r;
        }

        return answer;
    }
}