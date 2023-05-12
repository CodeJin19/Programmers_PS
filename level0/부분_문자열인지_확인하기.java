class Solution {
    public int solution(String my_string, String target) {
        int my_string_len = my_string.length();
        int target_len = target.length();
        
        for(int i = 0; i <= my_string_len - target_len; i++) {
            if(my_string.charAt(i) == target.charAt(0)) {
                boolean flag = true;
                
                for(int j = 0; j < target_len; j++) {
                    if(my_string.charAt(i + j) != target.charAt(j)) {
                        flag = false;
                    }
                }
                
                if(flag) {
                    return 1;
                }
            }
        }
        
        return 0;
    }
}