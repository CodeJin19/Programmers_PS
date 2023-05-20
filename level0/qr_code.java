class Solution {
    public String solution(int q, int r, String code) {
        StringBuilder sb = new StringBuilder();
        int len = code.length();
        
        for(int i = 0; i < len; i++) {
            if(i % q == r) {
                sb.append(code.charAt(i));
            }
        }
        
        return sb.toString();
    }
}