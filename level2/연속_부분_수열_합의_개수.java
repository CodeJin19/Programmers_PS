import java.util.*;

class Solution {
    public int solution(int[] elements) {
        HashSet<Integer> lists = new HashSet<>();
        int s, e, sum;

        sum = 0;

        for( e = 0; e < elements.length; e++) {
            sum += elements[e];
            lists.add(sum);
        }

        for(s = 1; s < elements.length; s++) {
            if(s == elements.length - 1) {
                e = 0;
            } else {
                e = s + 1;
            }
            
            sum = elements[s];
            lists.add(sum);

            while(e != s) {
                sum += elements[e++];
                lists.add(sum);

                e = e == elements.length ? 0 : e;
            }
        }

        return lists.size();
    }
}