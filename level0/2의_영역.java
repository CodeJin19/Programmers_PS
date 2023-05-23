class Solution {
    public int[] solution(int[] arr) {
        int from = Integer.MAX_VALUE;
        int to = Integer.MIN_VALUE;
        int[] answer;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 2) {
                if(from == Integer.MAX_VALUE || i < from) {
                    from = i;
                }
                
                if(to == Integer.MIN_VALUE || to < i) {
                    to = i;
                }
            }
        }
        
        if(from == Integer.MAX_VALUE) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[to - from + 1];
            int idx = 0;
            
            for(int i = from; i <= to; i++) {
                answer[i - from] = arr[i];
            }
        }
        
        return answer;
    }
}