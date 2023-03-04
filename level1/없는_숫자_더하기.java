class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean[] isUsed = new boolean[10];
        
        for(int i = 0; i < numbers.length; i++) {
            isUsed[numbers[i]] = true;
        }
        
        for(int i = 0; i < 10; i++) {
            if(!isUsed[i]) {
                answer += i;
            }
        }
        
        return answer;
    }
}