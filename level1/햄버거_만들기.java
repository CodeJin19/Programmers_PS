import java.util.Stack;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        int len = ingredient.length;

        if(len < 4) {
            return answer;
        }

        Stack<Integer> stck = new Stack<>();
        Stack<Integer> tmp = new Stack<>();

        for(int i = 0; i < 3; i++) {
            stck.push(ingredient[i]);
        }

        for(int i = 3; i < len; i++) {
            stck.push(ingredient[i]);
            
            
            if(stck.peek() == 1 && 4 <= stck.size()) {
                boolean flag = true;
                
                tmp.push(stck.pop());

                for(int j = 3; 0 < j; j--) {
                    tmp.push(stck.pop());

                    if(tmp.peek() != j) {
                        flag = false;
                    }
                }

                if(flag) {
                    answer++;

                    tmp = new Stack<>();
                } else {
                    while(!tmp.isEmpty()) {
                        stck.push(tmp.pop());
                    }
                }
            }
        }

        return answer;
    }
}