class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {0, 0};
        int odds = 0;
        int evens = 0;
        
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0)
                evens++;
            else
                odds++;
        }
        
        answer[0] = evens;
        answer[1] = odds;
        return answer;
    }
}