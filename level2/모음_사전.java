import java.util.*;

class Solution {

    int totalIdx;
    boolean hasFound;

    public void dfs(HashMap<String, Integer> wordMap, String[] vowel, StringBuilder sb, int idx, String word) {
        totalIdx++;

        if(word.equals(sb.toString())) {
            hasFound = true;
            return;
        }

        if(idx == 5) {
            return;
        }

        for(int i = 0; i < 5; i++) {
            StringBuilder newSB = new StringBuilder();
            newSB.append(sb);
            newSB.append(vowel[i]);
            dfs(wordMap, vowel, newSB, idx + 1, word);

            if(hasFound) {
                return;
            }
        }
    }

    public int solution(String word) {
        HashMap<String, Integer> wordMap  = new HashMap<>();
        String[] vowel = {"A", "E", "I", "O", "U"};
        String[] wordArr;
        int idx;
        totalIdx = 0;
        hasFound = false;

        for(int i = 0; i < 5; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(vowel[i]);
            dfs(wordMap, vowel, sb, 1, word);
            if(hasFound) {
                break;
            }
        }

        return totalIdx;
    }
}