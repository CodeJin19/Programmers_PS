class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int len1 = myString.length();
        int len2 = pat.length();
        
        for(int i = 0; i <= len1 - len2; i++) {
            if(myString.charAt(i) == pat.charAt(0)) {
                boolean flag = true;
                
                for(int j = 0; j < len2; j++) {
                    if(myString.charAt(i + j) != pat.charAt(j)) {
                        flag = false;
                        break;
                    }
                }
                
                if(flag) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}