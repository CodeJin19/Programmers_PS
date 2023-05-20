import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> al = new ArrayList<>();
        HashSet<Integer> hash = new HashSet<>();
        
        for(int i = 0; i < delete_list.length; i++) {
            hash.add(delete_list[i]);
        }
        
        for(int i = 0; i < arr.length; i++) {
            if(!hash.contains(arr[i])) {
                al.add(arr[i]);
            }
        }
        
        int[] answer = new int[al.size()];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = al.get(i);
        }
        
        return answer;
    }
}