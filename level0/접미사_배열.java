import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        int len = my_string.length();
        String[] answer = new String[len];
        StringBuilder sb;
        
        for(int i = 0; i < len; i++) {
            sb = new StringBuilder();
            
            for(int j = i; j < len; j++) {
                sb.append(my_string.charAt(j));
            }
            
            answer[i] = sb.toString();
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}