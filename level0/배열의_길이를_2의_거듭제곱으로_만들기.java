class Solution {
    public int[] solution(int[] arr) {
        int len = 1;
        int[] answer;

        while(len < arr.length) {
            len *= 2;
        }
        
        if(len == arr.length) {
            answer = arr;
        } else {
            answer = new int[len];
            int idx = 0;
            
            while(idx < arr.length) {
                answer[idx] = arr[idx];
                idx++;
            }
            
            while(idx < answer.length) {
                answer[idx++] = 0;
            }
        }

        return answer;
    }
}