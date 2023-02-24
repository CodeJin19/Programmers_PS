class Solution {
    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();
        int len = rsp.length();
        
        for(int i = 0; i < len; i++) {
            if(rsp.charAt(i) == '0') {
                sb.append("5");
            } else if(rsp.charAt(i) == '2') {
                sb.append("0");
            } else {
                sb.append("2");
            }
        }
        
        return sb.toString();
    }
}