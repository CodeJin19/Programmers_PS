import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        StringTokenizer st = new StringTokenizer(my_string);
        ArrayList<String> al = new ArrayList<>();
        
        while(st.hasMoreTokens()) {
            al.add(st.nextToken());
        }
        
        String[] answer = new String[al.size()];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = al.get(i);
        }
        
        return answer;
    }
}