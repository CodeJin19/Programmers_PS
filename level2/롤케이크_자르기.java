import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        int[] fromLeft = new int[topping.length];
        int[] fromRight = new int[topping.length];
        HashSet<Integer> hs = new HashSet<>();

        fromLeft[0] = 1;
        hs.add(topping[0]);

        for(int i = 1; i < topping.length; i++) {
            if(hs.contains(topping[i])) {
                fromLeft[i] = fromLeft[i - 1];
            } else {
                hs.add(topping[i]);
                fromLeft[i] = fromLeft[i - 1] + 1;
            }
        }

        hs = new HashSet<>();

        fromRight[topping.length - 1] = 1;
        hs.add(topping[topping.length - 1]);

        for(int i = topping.length - 2; 0 <= i; i--) {
            if(hs.contains(topping[i])) {
                fromRight[i] = fromRight[i + 1];
            } else {
                hs.add(topping[i]);
                fromRight[i] = fromRight[i + 1] + 1;
            }
        }

        for(int i = 0; i < topping.length - 1; i++) {
            if(fromLeft[i] == fromRight[i + 1]) {
                answer++;
            }
        }

        return answer;
    }
}