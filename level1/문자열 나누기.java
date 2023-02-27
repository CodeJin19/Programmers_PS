class Solution {
    public int solution(String s) {
        int answer = 0;
        int len = s.length();
        int cnt = 0;
        char c = s.charAt(0);

        for(int i = 0; i < len; i++) {
            if(cnt == 0) {
                cnt = 1;
                c = s.charAt(i);
                continue;
            }

            if(c != s.charAt(i)) {
                cnt--;
            } else {
                cnt++;
            }

            if(cnt == 0) {
                answer++;
            }
        }

        if(0 < cnt) {
            answer++;
        }
        return answer;
    }
}