import java.util.*;

class Solution {
    public int solution(String[] order) {
        int answer = 0;
        HashMap<String, Integer> price = new HashMap<>();

        price.put("iceamericano", 4500);
        price.put("americanoice", 4500);
        price.put("hotamericano", 4500);
        price.put("americanohot", 4500);
        price.put("americano", 4500);
        price.put("anything", 4500);

        price.put("icecafelatte", 5000);
        price.put("cafelatteice", 5000);
        price.put("hotcafelatte", 5000);
        price.put("cafelattehot", 5000);
        price.put("cafelatte", 5000);
        
        for(int i = 0; i < order.length; i++) {
            answer += price.get(order[i]);
        }

        return answer;
    }
}