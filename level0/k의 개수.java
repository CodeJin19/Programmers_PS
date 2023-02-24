class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int n = i; n <= j; n++) {
            int num = n;
            while(num != 0) {
                int d = num % 10;
                if(d == k)
                    answer++;
                num /= 10;
            }
        }
        return answer;
    }
}