import java.util.*;

class Solution {
    public boolean check(int num) {
        while(num != 0) {
            int r = num % 10;
            
            if(r != 5 && r != 0) {
                return false;
            }
            
            num /= 10;
        }
        
        return true;
    }
    
    public int[] solution(int l, int r) {
        ArrayList<Integer> al = new ArrayList<>();
        
        for(int i = l; i <= r; i++) {
            if(i % 5 == 0 && check(i)) {
                al.add(i);
            }
        }
        
        int[] answer;
        
        if(al.size() == 0) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[al.size()];
            int idx = 0;
            
            for(int num : al) {
                answer[idx++] = num;
            }
        }
        
        return answer;
    }
}