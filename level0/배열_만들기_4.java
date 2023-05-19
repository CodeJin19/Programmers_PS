import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stck = new Stack<>();
        int idx;
        
        for(idx = 0;idx < arr.length;) {
            if(stck.isEmpty()) {
                stck.push(arr[idx++]);
            } else if(stck.peek() < arr[idx]) {
                stck.push(arr[idx++]);
            } else {
                stck.pop();
            }
        }
        
        int[] answer = new int[stck.size()];
        
        for(idx = 0; idx < answer.length; idx++) {
            answer[answer.length - 1 - idx] = stck.pop();
        }
        
        return answer;
    }
}