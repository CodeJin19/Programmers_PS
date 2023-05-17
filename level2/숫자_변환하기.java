import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        int[] cnt= new int[y + 1];
        Queue<Integer> queue = new LinkedList<>();

        cnt[x] = 0;
        queue.offer(x);

        while(!queue.isEmpty()) {
            int num = queue.poll();

            if(num + n <= y) {
                if(cnt[num + n] == 0 || cnt[num] + 1 < cnt[num + n]) {
                    queue.offer(num + n);
                    cnt[num + n] = cnt[num] + 1;
                }
            }

            if(num * 2 <= y) {
                if(cnt[num * 2] == 0 || cnt[num] + 1 < cnt[num * 2]) {
                    queue.offer(num * 2);
                    cnt[num * 2] = cnt[num] + 1;
                }
            }

            if(num * 3 <= y) {
                if(cnt[num * 3] == 0 || cnt[num] + 1 < cnt[num * 3]) {
                    queue.offer(num * 3);
                    cnt[num * 3] = cnt[num] + 1;
                }
            }
        }

        if(cnt[y] == 0) {
            if(x == y) {
                return 0;
            } else {
                return -1;
            }
        } else {
            return cnt[y];
        }
    }
}