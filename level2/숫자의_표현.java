class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i = 1; i <= n; i++) {
            int sum = 0;
            int d = i;

            while(sum < n) {
                sum += d++;
            }

            if(sum == n) {
                answer++;
            }
        }

        return answer;
    }
}