class Solution {
    public int[] solution(int n, long left, long right) {
        long x, y;
        int len = (int)(right - left + 1);
        int[] answer = new int[len];
        int idx = 0;

        for(long i = left; i <= right; i++) {
            y = i / n + 1;
            x = i % n + 1;
            answer[idx++] = (int)Math.max(y, x);
        }

        return answer;
    }
}