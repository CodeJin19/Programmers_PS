import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> cnt = new HashMap <String, Integer> ();
        int answer = 1;
        
        for(int i = 0; i < clothes.length; i++) {
            if(cnt.containsKey(clothes[i][1])) {
                cnt.put(clothes[i][1], cnt.get(clothes[i][1]) + 1);
            } else {
                cnt.put(clothes[i][1], 1);
            }
        }
        
        for (Map.Entry<String, Integer> entry : cnt.entrySet())
            answer *= (entry.getValue() + 1);
        
        return --answer;
    }
}