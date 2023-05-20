class Solution {
    public String[] solution(String[] names) {
        int n = names.length / 5;
        
        if(names.length % 5 != 0) {
            n++;
        }
        
        String[] answer = new String[n];
        int idx = 0;
        
        for(int i = 0; i < names.length; i++) {
            if(i % 5 == 0) {
                answer[idx++] = names[i];
            }
        }
        return answer;
    }
}