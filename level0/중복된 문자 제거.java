class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        int len = my_string.length();
        boolean[] isUsedLowerCase = new boolean[26];
        boolean[] isUsedUpperCase = new boolean[26];
        boolean isUsedSpace = false;

        for(int i = 0; i < len; i++) {
            if(my_string.charAt(i) == ' ') {
                if(!isUsedSpace) {
                    isUsedSpace = true;
                    sb.append(' ');
                }
            } else if('a' <= my_string.charAt(i) && my_string.charAt(i) <= 'z'){
                int idx = (int) (my_string.charAt(i) - 'a');

                if(!isUsedLowerCase[idx]) {
                    isUsedLowerCase[idx] = true;
                    sb.append(my_string.charAt(i));
                }
            } else {
                int idx = (int) (my_string.charAt(i) - 'A');

                if(!isUsedUpperCase[idx]) {
                    isUsedUpperCase[idx] = true;
                    sb.append(my_string.charAt(i));
                }
            }
        }

        return sb.toString();
    }
}