import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        ArrayList<String> al = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int len = myStr.length();
        String tmp;
        
        for(int i = 0; i < len; i++) {
            if(myStr.charAt(i) == 'a' || myStr.charAt(i) == 'b' || myStr.charAt(i) == 'c') {
                tmp = sb.toString();
                
                if(tmp.length() != 0) {
                    al.add(tmp);
                }
                
                sb = new StringBuilder();
            } else {
                sb.append(myStr.charAt(i));
            }
        }
        
        tmp = sb.toString();
        
        if(tmp.length() != 0) {
            al.add(tmp);
        }
        
        String[] answer = new String[al.size()];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = al.get(i);
        }
        
        if(answer.length == 0) {
            answer = new String[1];
            answer[0] = "EMPTY";
        }
        
        return answer;
    }
}