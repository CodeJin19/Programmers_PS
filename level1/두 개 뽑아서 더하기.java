class Solution {
    public int[] solution(int[] numbers) {
        boolean[] cache = new boolean[210];
        int cnt = 0;
        
        for(int i = 0; i < numbers.length - 1; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                if(!cache[numbers[i] + numbers[j]]) {
                    cache[numbers[i] + numbers[j]] = true;
                    cnt++;
                }
            }
        }
        
        int[] answer = new int[cnt];
        int idx = 0;
        
        for(int i = 0; i < 201; i++) {
            if(cache[i]) {
                answer[idx++] = i; 
            }
        }
        
        return answer;
    }
}