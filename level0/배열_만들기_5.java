import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> al = new ArrayList<>();
        StringBuilder sb;
        
        for(int i = 0; i < intStrs.length; i++) {
            sb = new StringBuilder();
            
            for(int j = 0; j < l; j++) {
                sb.append(intStrs[i].charAt(s + j));
            }
            
            int num = Integer.parseInt(sb.toString());
            
            if(k < num) {
                al.add(num);
            }
        }
        
        int[] answer = new int[al.size()];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = al.get(i);
        }
        
        return answer;
    }
}