class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        int[] d = new int[26];
        int len = skip.length();

        for(int i = 0; i < 26; i++) {
            d[i] = 1;
        }

        for(int i = 0; i < len; i++) {
            int idx = (int)(skip.charAt(i) - 'a');
            d[idx] = 0;
        }

        len = s.length();

        for(int i = 0; i < len; i++) {
            int idx = (int) (s.charAt(i)- 'a');
            int cnt = 0;

            while(cnt != index) {
                idx++;
                idx = idx == 26 ? 0 : idx;
                cnt += d[idx];
            }

            char c = (char)('a' + idx);
            sb.append(c);
        }

        return sb.toString();
    }
}