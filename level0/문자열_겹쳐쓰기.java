class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder sb = new StringBuilder();        
        int my_string_len = my_string.length();
        int overwrite_string_len = overwrite_string.length();
        
        for(int i = 0; i < s; i++) {
            sb.append(my_string.charAt(i));
        }
        
        sb.append(overwrite_string);
        
        for(int i = s + overwrite_string_len; i < my_string_len; i++) {
            sb.append(my_string.charAt(i));
        }
        
        return sb.toString();
    }
}