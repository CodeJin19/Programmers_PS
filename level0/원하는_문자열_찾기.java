class Solution {
    public int solution(String myString, String pat) {
        int myStringLen = myString.length();
        int patLen = pat.length();
        
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        
        if(myStringLen < patLen) {
            return 0;
        }
        
        for(int i = 0; i <= myStringLen - patLen; i++) {
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