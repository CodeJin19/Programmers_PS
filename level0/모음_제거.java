class Solution {
    public String solution(String my_string) {
        int len = my_string.length();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < len; i++) {
            if(my_string.charAt(i) == 'a' || my_string.charAt(i) == 'e' || my_string.charAt(i) == 'i' || my_string.charAt(i) == 'o' || my_string.charAt(i) == 'u') {
                continue;
            }
            
            sb.append(my_string.charAt(i));
        }
        
        return sb.toString();
    }
}