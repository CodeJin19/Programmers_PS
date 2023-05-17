class Solution {
    boolean solution(String s) {
        int b = 0;
        int len = s.length();

        for(int i = 0; i < len; i++) {
            if(s.charAt(i) == '(') {
                b++;
            } else {
                if(b <= 0) {
                    return false;
                } else {
                    b--;
                }
            }
        }

        if(b == 0) {
            return true;
        } else {
            return false;
        }
    }
}