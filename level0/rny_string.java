class Solution {
    public String solution(String rny_string) {
        int len = rny_string.length();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < len; i++) {
            char c = rny_string.charAt(i);
            
            if(c == 'm') {
                sb.append("rn");
            } else {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}