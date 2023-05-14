class Solution {
    public int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();
        int len = myString.length();
        int patLen = pat.length();
        
        for(int i = 0; i < len; i++) {
            if(myString.charAt(i) == 'A') {
                sb.append("B");
            } else {
                sb.append("A");
            }
        }
        
        myString = sb.toString();
        
        for(int i = 0; i <= len - patLen; i++) {
            if(myString.charAt(i) == pat.charAt(0)) {
                boolean flag = true;
                
                for(int j = 0; j < patLen; j++) {
                    if(myString.charAt(i + j) != pat.charAt(j)) {
                        flag = false;
                        break;
                    }
                }
                
                if(flag) {
                    return 1;
                }
            }
        }
        return 0;
    }
}