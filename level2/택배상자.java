import java.util.*;

class Solution {
    public int solution(int[] order) {
        Stack<Integer> stck = new Stack<>();
        Stack<Integer> tmp = new Stack<>();
        int answer = 0;
        int orderIdx = 0;
        int listIdx = 0;

        for(int i = 0; i < order.length; i++) {
            stck.push(order.length - i);
        }

        while(!stck.isEmpty()) {
            if(!tmp.isEmpty()) {
                if(tmp.peek() == order[orderIdx]) {
                    tmp.pop();
                    orderIdx++;
                    answer++;
                } else {
                    while(!stck.isEmpty() && tmp.peek() != order[orderIdx]) {
                        tmp.push(stck.pop());
                    }

                    if(tmp.peek() == order[orderIdx]) {
                        tmp.pop();
                        orderIdx++;
                        answer++;
                    }
                }
            } else {
                 do {
                     tmp.push(stck.pop());
                 } while(!stck.isEmpty() && tmp.peek() != order[orderIdx]);

                 if(tmp.peek() == order[orderIdx]) {
                     tmp.pop();
                     orderIdx++;
                     answer++;
                 }
            }
        }

        while(!tmp.isEmpty() && tmp.peek() == order[orderIdx]) {
            tmp.pop();
            orderIdx++;
            answer++;
        }

        return answer;
    }
}