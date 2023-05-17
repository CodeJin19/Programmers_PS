import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        HashMap<Integer, Integer> priodritiesMap = new HashMap<>();
        int[] orderArr = new int[priorities.length];
        int[] keyArr;
        int idx, order, keyIdx, target, left;

        for(int i = 0; i < priorities.length; i++) {
            if(priodritiesMap.containsKey(priorities[i])) {
                int cnt = priodritiesMap.get(priorities[i]);
                priodritiesMap.put(priorities[i], cnt + 1);
            } else {
                priodritiesMap.put(priorities[i], 1);
            }
        }

        keyArr = new int[priodritiesMap.size()];
        idx = 0;

        for(int key : priodritiesMap.keySet()) {
            keyArr[idx++] = key;
        }

        Arrays.sort(keyArr);

        for(int i = 0; i < orderArr.length; i++) {
            orderArr[i] = -1;
        }

        idx = 0;
        keyIdx = keyArr.length - 1;
        order = 1;
        target = keyArr[keyIdx];
        left = priodritiesMap.get(keyArr[keyIdx]) - 1;
        priodritiesMap.put(keyArr[keyIdx], left);

        while(true) {
            while(priorities[idx] != target) {
                idx++;
                idx = idx == priorities.length ? 0 : idx;
            }

            orderArr[idx] = order++;

            if(priorities.length < order) {
                break;
            }

            idx++;
            idx = idx == priorities.length ? 0 : idx;

            if(priodritiesMap.get(keyArr[keyIdx]) == 0) {
                keyIdx--;
            }

            target = keyArr[keyIdx];
            left = priodritiesMap.get(keyArr[keyIdx]) - 1;
            priodritiesMap.put(keyArr[keyIdx], left);
        }

        if(orderArr[location] < 0) {
            return priorities.length;
        } else {
            return orderArr[location];
        }
    }
}