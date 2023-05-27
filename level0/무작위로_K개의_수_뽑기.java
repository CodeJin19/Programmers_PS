import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        int idx = 0;
        HashSet<Integer> hash = new HashSet<>();
        
        for(int i = 0; i < arr.length; i++) {
            if(!hash.contains(arr[i])) {
                answer[idx++] = arr[i];
                hash.add(arr[i]);
            }
            
            if(answer.length == idx) {
                break;
            }
        }
        
        while(idx < answer.length) {
            answer[idx++] = -1;
        }

        return answer;
    }
}