class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for(int i = 1; i <= number; i++) {
            int sqrt = (int)(Math.sqrt(i));
            int cnt = 0;

            for(int j = 1; j <= sqrt; j++) {
                if(i % j == 0) {
                    cnt++;
                }

                if(limit < cnt) {
                    break;
                }
            }

            cnt *= 2;

            if(sqrt * sqrt == i) {
                cnt--;
            }

            if(cnt <= limit) {
                answer += cnt;
            } else {
                answer += power;
            }
        }

        return answer;
    }
}