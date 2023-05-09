class Solution {
    public String solution(String myString) {
        int len = myString.length();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < len; i++) {
            char c = myString.charAt(i);
            
            if('a' <= c && c <= 'z') {
                c = (char)('A' + (int)(c - 'a'));
            }
            
            sb.append(c);
        }
        
        return sb.toString();
    }
}