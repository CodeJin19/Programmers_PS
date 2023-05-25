import java.util.*;

class Solution {
    public String[] solution(String myString) {
        ArrayList<String> al = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int len = myString.length();
        
        for(int i = 0; i < len; i++) {
            if(myString.charAt(i) == 'x') {
                if(sb.toString().length() != 0) {
                    al.add(sb.toString());
                }
                
                sb = new StringBuilder();
            } else {
                sb.append(myString.charAt(i));
            }
        }
        
        if(sb.toString().length() != 0) {
            al.add(sb.toString());
        }
        
        String[] answer = new String[al.size()];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = al.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}