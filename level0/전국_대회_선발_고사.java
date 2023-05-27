import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i = 0; i < rank.length; i++) {
            if(attendance[i]) {
                pq.add(rank[i]);
                hm.put(rank[i], i);
            }
        }
        
        int a = pq.poll();
        a = hm.get(a);
        
        int b = pq.poll();
        b = hm.get(b);
        
        int c = pq.poll();
        c = hm.get(c);
        
        answer = a * 10000 + b * 100 + c;
        
        return answer;
    }
}