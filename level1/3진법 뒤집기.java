class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();
        int answer = 0;
        
        while(n != 0) {
            int r = n % 3;
            n /= 3;
            
            sb.append(r);
        }
        
        String tmp = sb.toString();
        int len = tmp.length();
        
        for(int i = 0; i < len; i++) {
            answer *= 3;
            answer += (int) (tmp.charAt(i) - '0');
        }
        
        return answer;
    }
}