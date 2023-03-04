class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int[] cnt = new int[26];
        int len = s.length();
        
        for(int i = 0; i < len; i++) {
            int idx = s.charAt(i) - 'a';
            cnt[idx]++;
        }
        
        for(int i = 0; i < 26; i++) {
            if(cnt[i] == 1) {
                sb.append((char) (i + 'a'));
            }
        }
        
        return sb.toString();
    }
}