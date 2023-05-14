class Solution {
    public String solution(String my_string, String alp) {
        StringBuilder sb = new StringBuilder();
        int len = my_string.length();
        char c = alp.charAt(0);
        char newC = (char)('A' + (int)(c - 'a'));
        
        for(int i = 0; i < len; i++) {
            if(my_string.charAt(i) == c) {
                sb.append(newC);
            } else {
                sb.append(my_string.charAt(i));
            }
        }
        
        return sb.toString();
    }
}