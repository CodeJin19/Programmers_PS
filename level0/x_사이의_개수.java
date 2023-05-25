import java.util.*;

class Solution {
    public int[] solution(String myString) {
        ArrayList<Integer> al = new ArrayList<>();
        int len = myString.length();
        int cnt = 0;
        
        for(int i = 0; i < len; i++) {
            if(myString.charAt(i) == 'x') {
                al.add(cnt);
                cnt = 0;
            } else {
                cnt++;
            }
        }
        
        al.add(cnt);
        int[] answer = new int[al.size()];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = al.get(i);
        }
        
        return answer;
    }
}