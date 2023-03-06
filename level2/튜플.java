import java.util.*;

class Solution {
    public int[] solution(String s) {
        HashMap<Integer, Integer> sizeList = new HashMap<>();
        HashMap<Integer, Integer> numCache = new HashMap<>();
        ArrayList<Integer>[] total;
        ArrayList<Integer> tmp;
        StringTokenizer st;
        String tuple;
        int[] answer = {};
        int len = s.length() - 1;
        int cnt = 0;
        int num, idx, max;

        for(int i = 1; i < len ;i++) {
            if(s.charAt(i) == '{') {
                cnt++;
            }
        }

        total = new ArrayList[cnt];

        st = new StringTokenizer(s, "{");
        idx = 0;

        while(st.hasMoreTokens()) {
            tuple = st.nextToken();
            len = tuple.length();
            tmp = new ArrayList<>();
            num = 0;

            for(int i = 0; i < len; i++) {
                if(tuple.charAt(i) == ',') {
                    tmp.add(num);
                    num = 0;
                } else if(tuple.charAt(i) == '}') {
                    tmp.add(num);
                    break;
                } else {
                    num *= 10;
                    num += (int)(tuple.charAt(i) - '0');
                }
            }

            total[idx++] = tmp;
        }

        max = Integer.MIN_VALUE;

        for(int i = 0; i < total.length; i++) {
            sizeList.put(total[i].size(), i);
            max = Math.max(max, total[i].size());
        }

        answer = new int[max];

        for(int i = 1; i <= answer.length; i++) {
            idx = sizeList.get(i);
            len = total[idx].size();

            for(int j = 0; j < len; j++) {
                if(!numCache.containsKey(total[idx].get(j))) {
                    answer[i - 1] = total[idx].get(j);
                    numCache.put(total[idx].get(j), 1);
                }
            }
        }

        return answer;
    }
}