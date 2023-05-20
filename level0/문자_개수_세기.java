class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        int len = my_string.length();
        
        for(int i = 0; i < len; i++) {
            char c = my_string.charAt(i);
            int idx;
            
            if('A' <= c && c <= 'Z') {
                idx = (int)(c - 'A');
            } else {
                idx = (int)(c - 'a') + 26;
            }
            
            answer[idx]++;
        }
        
        return answer;
    }
}