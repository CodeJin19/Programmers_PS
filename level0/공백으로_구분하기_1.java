import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        StringTokenizer st = new StringTokenizer(my_string);
        ArrayList<String> list = new ArrayList<>();
        
        while(st.hasMoreTokens()) {
            list.add(st.nextToken());
        }
        
        String[] answer = new String[list.size()];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}