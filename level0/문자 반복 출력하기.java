class Solution {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        int len = my_string.length();
        
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < n; j++) {
                sb.append(my_string.charAt(i));
            }
        }
        
        return sb.toString();
    }
}