import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> al = new ArrayList<>();
        
        while(n != 1) {
            al.add(n);
            
            if(n % 2 == 1) {
                n = n * 3 + 1;
            } else {
                n /= 2;
            }
        }
        
        al.add(1);
        
        int[] answer = new int[al.size()];
        int idx = 0;
        
        for(int num : al) {
            answer[idx++] = num;
        }
        
        return answer;
    }
}