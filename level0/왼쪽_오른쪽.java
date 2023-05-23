class Solution {
    public String[] solution(String[] str_list) {
        int idx = 0;
        String[] answer;
        
        while(idx < str_list.length && str_list[idx].charAt(0) != 'l' && str_list[idx].charAt(0) != 'r') {
            idx++;
        }
        
        if(idx == str_list.length) {
            answer = new String[0];
        } else if(str_list[idx].charAt(0) == 'l') {
            answer = new String[idx];
            
            for(int i = 0; i < idx; i++) {
                answer[i] = str_list[i];
            }
        } else {
            answer = new String[str_list.length - idx - 1];
            
            for(int i = idx + 1; i < str_list.length; i++) {
                answer[i - idx - 1] = str_list[i];
            }
        }
        
        return answer;
    }
}