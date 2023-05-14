class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[1 + (num_list.length - 1) / n];
        int idx = 0;
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = num_list[idx];
            idx += n;
        }
        
        return answer;
    }
}