class Solution {
    public String[] solution(String my_str, int n) {
        int len = my_str.length();
        int total = len / n;
        total += len % n > 0 ? 1 : 0;

        String[] answer = new String[total];
        int idx = 0;
        int cnt = 0;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < len; i++) {
            sb.append(my_str.charAt(i));
            cnt++;
            
            if(cnt == n) {
                answer[idx++] = sb.toString();
                sb = new StringBuilder();
                cnt = 0;
            }
        }
        
        if(0 < cnt) {
            answer[idx++] = sb.toString();
        }

        return answer;
    }
}