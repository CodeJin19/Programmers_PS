import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        ArrayList<Integer> al = new ArrayList<>();
        int[] answer;
        
        if(n == 1) {
            for(int i = 0; i <= slicer[1]; i++) {
                al.add(num_list[i]);
            }
        } else if(n == 2) {
            for(int i = slicer[0]; i < num_list.length; i++) {
                al.add(num_list[i]);
            }
        } else if(n == 3) {
            for(int i = slicer[0]; i <= slicer[1]; i++) {
                al.add(num_list[i]);
            }
        } else if(n == 4) {
            for(int i = slicer[0]; i <= slicer[1]; ) {
                al.add(num_list[i]);
                i += slicer[2];
            }
        }
        
        int len = al.size();
        answer = new int[len];
        
        for(int i = 0; i < len; i++) {
            answer[i] = al.get(i);
        }
        
        return answer;
    }
}