class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        int len = my_string.length();
        
        for(int i = len - 1; 0 <= i; i--) {
            sb.append(my_string.charAt(i));    
        }
        
        return sb.toString();
    }
}