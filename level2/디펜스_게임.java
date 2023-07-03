import java.util.*;

class Solution {
    public int solution(int n, int k, int[] enemy) {
        if(enemy.length <= k) {
            return enemy.length;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i <= k; i++) {
            pq.offer(enemy[i]);
        }

        int idx = k + 1;

        for(; idx < enemy.length; idx++) {
            if(pq.peek() <= n) {
                n -= pq.poll();
                pq.offer(enemy[idx]);
            } else {
                break;
            }
        }

        if(n < pq.peek()) {
            return idx - 1;
        } else {
            return idx;
        }
    }
}