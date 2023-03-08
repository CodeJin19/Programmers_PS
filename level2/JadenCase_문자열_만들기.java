class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int len = s.length();
        boolean flag = false;

        for(int i = 0; i < len; i++) {
            if(flag) {
                if('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
                    flag = true;
                    int d = (int)(s.charAt(i) - 'A');
                    char c = (char)('a' + d);
                    answer.append(c);
                } else if(s.charAt(i) == ' ') {
                    flag = false;
                    answer.append(s.charAt(i));
                } else {
                    flag = true;
                    answer.append(s.charAt(i));
                }
            } else {
                if('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
                    flag = true;
                    int d = (int)(s.charAt(i) - 'a');
                    char c = (char)('A' + d);
                    answer.append(c);
                } else if(s.charAt(i) == ' ') {
                    flag = false;
                    answer.append(s.charAt(i));
                } else {
                    flag = true;
                    answer.append(s.charAt(i));
                }
            }
        }

        return answer.toString();
    }
}