class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int cnt = 0;
        String[] answer;
        
        for(int i = 0; i < finished.length; i++) {
            if(!finished[i]) {
                cnt++;
            }
        }
        
        answer = new String[cnt];
        int idx = 0;
        
        for(int i = 0; i < todo_list.length; i++) {
            if(!finished[i]) {
                answer[idx++] = todo_list[i];
            }
        }
        
        return answer;
    }
}