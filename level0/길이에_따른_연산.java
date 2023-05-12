class Solution {
    public int solution(int[] num_list) {
        int answer;
        
        if(10 < num_list.length) {
            answer = 0;
            
            for(int i = 0; i < num_list.length; i++) {
                answer += num_list[i];
            }
        } else {
            answer = 1;
            
            for(int i = 0; i < num_list.length; i++) {
                answer *= num_list[i];
            }
        }
        
        return answer;
    }
}