class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long num = Long.parseLong(p);
        int tLen = t.length();
        int pLen = p.length();

        for(int i = 0; i < tLen - pLen + 1; i++) {
            long x = 0;

            for(int j = 0; j < pLen; j++) {
                x *= 10;
                x += (long) (t.charAt(i + j) - '0');
            }

            if(x <= num) {
                answer++;
            }
        }

        return answer;
    }
}