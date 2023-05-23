import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        ArrayList<String> al = new ArrayList<>();
        
        for(int i = 0; i < strArr.length; i++) {
            int len = strArr[i].length();
            boolean flag = false;
            
            for(int j = 0; j < len - 1; j++) {
                if(strArr[i].charAt(j) == 'a' && strArr[i].charAt(j + 1) == 'd') {
                    flag = true;
                    break;
                }
            }
            
            if(!flag) {
                al.add(strArr[i]);
            }
        }
        
        answer = new String[al.size()];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = al.get(i);
        }
        
        return answer;
    }
}