class Solution {
    public int solution(int n) {
        int answer = 0;
        double x = Math.sqrt(n);
        answer = (int) x;

        if(answer * answer == n)
            return 1;
        else
            return 2;
    }
}