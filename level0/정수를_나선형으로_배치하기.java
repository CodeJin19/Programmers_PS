class Solution {
    public int solution(String my_string, String is_suffix) {
        int my_string_len = my_string.length();
        int is_suffix_len = is_suffix.length();
        
        if(my_string_len < is_suffix_len) {
            return 0;
        }
        
        for(int i = 0; i < is_suffix_len; i++) {
            if(my_string.charAt(my_string_len - is_suffix_len + i) != is_suffix.charAt(i)) {
                return 0;
            }
        }
        return 1;
    }
}