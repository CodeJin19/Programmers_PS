import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> list = new HashMap<>();
        
        for(int i = 0; i < participant.length; i++) {
            int val;
            
            if(list.containsKey(participant[i])) {
                val = list.get(participant[i]);
                list.put(participant[i], val + 1);
            } else {
                val = 1;
                list.put(participant[i], val);
            }
        }
        
        for(int i = 0; i < completion.length; i++) {
            int val = list.get(completion[i]);
            
            list.put(completion[i], val - 1);
        }
        
        for(String key : list.keySet()) {
            if(list.get(key) == 1) {
                return key;
            }
        }
        
        return answer;
    }
}