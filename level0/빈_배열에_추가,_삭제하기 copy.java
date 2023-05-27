import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        Stack<Integer> stck = new Stack<>();

        for(int i = 0; i < arr.length; i++) {
            if(flag[i]) {
                for(int j = 0; j < arr[i] * 2; j++) {
                    stck.push(arr[i]);
                }
            } else {
                for(int j = 0; j < arr[i]; j++) {
                    stck.pop();
                }
            }
        }

        int[] answer = new int[stck.size()];

        for(int i = answer.length - 1; 0 <= i; i--) {
            answer[i] = stck.pop();
        }

        return answer;
    }
}