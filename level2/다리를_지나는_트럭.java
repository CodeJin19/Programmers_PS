import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int sum = 0;
        int idx = 0;
        Queue<int[]> queue = new LinkedList<>();

        while(idx < truck_weights.length) {
            if(sum + truck_weights[idx] <= weight && queue.size() + 1 <= bridge_length) {
                sum += truck_weights[idx];

                int[] tmp = new int[2];
                tmp[0] = truck_weights[idx++];
                tmp[1] = answer++;

                queue.add(tmp);
            } else {
                int[] tmp = queue.poll();

                answer = answer < tmp[1] + bridge_length ? tmp[1] + bridge_length : answer;
                sum -= tmp[0];
            }
        }

        while(!queue.isEmpty()) {
            int[] tmp = queue.poll();
            
            answer = answer < tmp[1] + bridge_length ? tmp[1] + bridge_length : answer;
        }

        return answer + 1;
    }
}