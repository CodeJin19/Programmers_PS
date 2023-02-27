class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] cnt = new int[26];
        
        for(int i = 0; i < 26; i++) {
            cnt[i] = -1;
        }

        for(int i = 0; i < s.length(); i++) {
            int idx = (int) (s.charAt(i) - 'a');

            if(cnt[idx] == -1) {
                answer[i] = -1;
            } else {
                answer[i] = i - cnt[idx];
            }

            cnt[idx] = i;
        }

        return answer;
    }
}