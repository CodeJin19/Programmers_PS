import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        HashMap<String, Integer> wordsHashMap = new HashMap<>();
        int[] answer = {0, 0};
        int[] cnt = new int[n + 1];
        int cntIdx = 1;

        wordsHashMap.put(words[0], 1);
        cnt[cntIdx]++;
        cntIdx++;

        for(int i = 1; i < words.length; i++) {
            cntIdx = n < cntIdx ? 1 : cntIdx;

            cnt[cntIdx]++;

            int prevLen = words[i - 1].length();

            if(words[i - 1].charAt(prevLen - 1) != words[i].charAt(0)) {
                answer[0] = cntIdx;
                answer[1] = cnt[cntIdx];
                
                return answer;
            } else if(wordsHashMap.containsKey(words[i])) {
                answer[0] = cntIdx;
                answer[1] = cnt[cntIdx];
                
                return answer;
            } else {
                wordsHashMap.put(words[i], 1);
            }

            cntIdx++;
        }

        return answer;
    }
}