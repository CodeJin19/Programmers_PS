class Solution {
    public String solution(String code) {
        StringBuilder sb = new StringBuilder();
        int len = code.length();
        int mode = 0;
        
        for(int i = 0; i < len; i++) {
            if(code.charAt(i) == '1') {
                if(mode == 0) {
                    mode = 1;
                } else {
                    mode = 0;
                }
            } else {
                if(mode == 0) {
                    if(i % 2 == 0) {
                        sb.append(code.charAt(i));
                    }
                } else if(mode == 1) {
                    if(i % 2 == 1) {
                        sb.append(code.charAt(i));
                    }
                }
            }
        }
        
        if(sb.toString().length() == 0) {
            return "EMPTY";
        } else {
            return sb.toString();
        }
    }
}