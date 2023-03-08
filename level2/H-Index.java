import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);
        
        int l = 0;
        int r = citations[citations.length - 1];
        

        while(l <= r) {
            int h = (l + r) / 2;
            int cnt = 0;

            for(int i = 0; i < citations.length; i++) {
                if(h <= citations[i]) {
                    cnt++;
                }
            }

            if(h <= cnt) {
                answer = h;
                l = h + 1;
            } else {
                r = h - 1;
            }
        }

        return answer;
    }
}