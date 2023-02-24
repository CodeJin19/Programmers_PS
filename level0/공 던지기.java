class Solution {
    public int solution(int[] numbers, int k) {
        int answer = k * 2 - 1;
        answer %= numbers.length;
        return answer;
    }
}