class Solution {
    public String solution(String myString) {        
        StringBuilder sb = new StringBuilder();
        int len = myString.length();
        
        for(int i = 0; i < len; i++) {
            char c  = myString.charAt(i);
            
            if('B' <= c && c <= 'Z') {
                c = (char)('a' + (int)(c - 'A'));
            } else if(c == 'a') {
                c = 'A';
            }
            
            sb.append(c);
        }
        
        return sb.toString();
    }
}