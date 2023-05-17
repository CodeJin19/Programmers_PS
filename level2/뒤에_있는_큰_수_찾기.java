import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        int idx = numbers.length - 1;
        answer[idx] = -1;

        Stack<Integer> stck = new Stack<>();
        stck.push(numbers[idx]);

        idx--;

        while(0 <= idx) {
            if(stck.peek() <= numbers[idx]) {
                while(!stck.isEmpty() && stck.peek() <= numbers[idx]) {
                    stck.pop();
                }

                if(stck.isEmpty()) {
                    answer[idx] = -1;
                    stck.push(numbers[idx]);
                } else {
                    answer[idx] = stck.peek();
                    stck.push(numbers[idx]);
                }
            } else if(numbers[idx] < stck.peek()) {
                answer[idx] = stck.peek();
                stck.push(numbers[idx]);
            }

            idx--;
        }

        return answer;
    }
}