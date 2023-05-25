class Solution {
    public String solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();
        int len1 = myString.length();
        int len2 = pat.length();
        int idx = 0;
        
        for(int i = len1 - 1; 0 <= i; i--) {
            if(myString.charAt(i) == pat.charAt(len2 - 1)) {
                boolean flag = true;
                
                for(int j = 0; j < len2; j++) {
                    if(myString.charAt(i - j) != pat.charAt(len2 - 1 - j)) {
                        flag = false;
                        break;
                    }
                }
                
                if(flag) {
                    idx = i;
                    break;
                }
            }
        }
        
        for(int i = 0; i <= idx; i++) {
            sb.append(myString.charAt(i));
        }
        
        return sb.toString();
    }
}