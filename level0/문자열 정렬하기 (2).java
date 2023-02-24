import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        int len = my_string.length();
        char[] array = new char[len];
        
        for(int i = 0; i < len; i++) {
            char c = my_string.charAt(i);
            
            if('A' <= c && c <= 'Z') {
                c = (char) (c - 'A' + 'a');
            }
            
            array[i] = c;
        }
        
        Arrays.sort(array);
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < len; i++) {
            sb.append(array[i]);
        }
        
        return sb.toString();
    }
}