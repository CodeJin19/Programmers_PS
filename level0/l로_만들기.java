class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        int len = myString.length();
        
        for(int i = 0; i < len; i++) {
            if(myString.charAt(i) < 'l') {
                sb.append("l");
            } else {
                sb.append(myString.charAt(i));
            }
        }
        
        return sb.toString();
    }
}