import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap <Integer, Integer> sizesHashMap = new HashMap<>();

        for(int i = 0; i < tangerine.length; i++) {
            if(!sizesHashMap.containsKey(tangerine[i])) {
                sizesHashMap.put(tangerine[i], 1);
            } else {
                int cnt = sizesHashMap.get(tangerine[i]);
                sizesHashMap.put(tangerine[i], cnt + 1);
            }
        }

        int[] sizes = new int[sizesHashMap.size()];
        int idx = 0;

        for(int key : sizesHashMap.keySet()) {
            sizes[idx++] = sizesHashMap.get(key);
        }

        Arrays.sort(sizes);
        int sum = 0;
        idx = sizes.length - 1;

        while(sum < k) {
            sum += sizes[idx--];
            answer++;
        }

        return answer;
    }
}