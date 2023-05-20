class Solution {
    public String solution(String n_str) {
        StringBuilder sb = new StringBuilder();
        int len = n_str.length();
        int idx = 0;
        
        while(n_str.charAt(idx) == '0') {
            idx++;
        }
        
        while(idx < len) {
            sb.append(n_str.charAt(idx++));
        }
            
        return sb.toString();
    }
}