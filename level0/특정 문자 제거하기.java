class Solution {
    public String solution(String my_string, String letter) {
        StringBuilder sb = new StringBuilder();
        int len = my_string.length();
        char c = letter.charAt(0);
        
        for(int i = 0; i < len; i++) {
            if(my_string.charAt(i) == c)
                continue;
            
            sb.append(my_string.charAt(i));
        }
        
        return sb.toString();
    }
}