class Solution {
    public String solution(String my_string, int n) {
        int my_string_len = my_string.length();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < n; i++) {
            sb.append(my_string.charAt(my_string_len - n + i));
        }
        
        return sb.toString();
    }
}