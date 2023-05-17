import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int cnt = 0;
        int val = 0;
        int len = 0;

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(int i = 0; i < scoville.length; i++) {
            queue.offer(scoville[i]);
            len++;
        }

        val = queue.peek();

        while(val < K && 1 < len) {
            val = queue.poll() + 2 * queue.poll();
            cnt++;
            len--;

            queue.offer(val);
            val = queue.peek();
        }

        if(K <= queue.peek()) {
            return cnt;
        } else {
            return -1;
        }
    }
}