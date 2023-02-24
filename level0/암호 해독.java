class Solution {
    public String solution(String cipher, int code) {
        StringBuilder sb = new StringBuilder();
        int len = cipher.length();
        int cnt = 1;

        for(int i = 0; i < len; i++) {
            if(cnt == code) {
                sb.append(cipher.charAt(i));
                cnt = 1;
            } else {
                cnt++;
            }
            
        }

        return sb.toString();
    }
}