class Solution {
    public int solution(String my_string, String is_prefix) {
        int len1 = my_string.length();
        int len2 = is_prefix.length();
        
        if(len1 < len2) {
            return 0;
        }
        
        for(int i = 0; i < len2; i++) {
            if(my_string.charAt(i) != is_prefix.charAt(i)) {
                return 0;
            }
        }
        
        return 1;
    }
}