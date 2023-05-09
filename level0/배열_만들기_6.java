import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        
        for(int i = 1; i < arr.length; i++) {
            if(stack.isEmpty()) {
                stack.push(arr[i]);
            } else {
                if(stack.peek() == arr[i]) {
                    stack.pop();
                } else {
                    stack.push(arr[i]);
                }
            }
        }
        
        if(stack.isEmpty()) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[stack.size()];
            int[] reverse = new int[stack.size()];
            
            for(int i = 0; i < reverse.length; i++) {
                reverse[i] = stack.pop();
            }
            
            for(int i = 0; i < answer.length; i++) {
                answer[i] = reverse[reverse.length - 1- i];
            }
        }
        
        return answer;
    }
}