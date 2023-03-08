import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        HashMap<String, Integer> order = new HashMap<>();
        HashMap<String, Integer> left = new HashMap<>();
        int answer = 0;
        boolean isAllZero;

        for(int i = 0; i < want.length; i++) {
            order.put(want[i], number[i]);
            left.put(want[i], number[i]);
        }


        for(int i = 0; i < 10; i++) {
            if(left.containsKey(discount[i])) {
                int val = left.get(discount[i]);
                left.put(discount[i], val - 1);
            }
        }

        isAllZero = true;

        for(String object : left.keySet()) {
            if(0 < left.get(object)) {
                isAllZero = false;
                break;
            }
        }

        if(isAllZero) {
            answer++;
        }

        for(int i = 10; i < discount.length; i++) {
            if(left.containsKey(discount[i - 10])) {
                int l = left.get(discount[i - 10]) + 1;
                int o = order.get(discount[i - 10]);

                if (l < o) {
                    left.put(discount[i - 10], l);
                } else {
                    left.put(discount[i - 10], o);
                }
            }

            if(left.containsKey(discount[i])) {
                int val = left.get(discount[i]);
                left.put(discount[i], val - 1);
            }

            isAllZero = true;

            for(String object : left.keySet()) {
                if(0 < left.get(object)) {
                    isAllZero = false;
                    break;
                }
            }

            if(isAllZero) {
                answer++;
            }
        }

        return answer;
    }
}