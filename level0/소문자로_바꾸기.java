class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        int len = myString.length();
        
        for(int i = 0; i < len; i++) {
            char c = myString.charAt(i);
            
            if('a' <= c && c <= 'z') {
                sb.append(c);
            } else {
                char newC = (char)('a' + (int)(c - 'A'));
                sb.append(newC);
            }
        }
        
        return sb.toString();
    }
}