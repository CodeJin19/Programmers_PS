class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int[] sum = new int[score.length];
        
        for(int i = 0; i < score.length; i++) {
            sum[i] = score[i][0] + score[i][1];
        }
        
        int val = 1;
        int cnt, max;
        
        while(val <= score.length) {
            max = -1;
            
            for(int i = 0; i < sum.length; i++) {
                max = max < sum[i] ? sum[i] : max;
            }
            
            cnt = 0;
            
            for(int i = 0; i < sum.length; i++) {
                if(sum[i] == max) {
                    cnt++;
                    sum[i] = -1;
                    answer[i] = val;
                }
            }
            
            val += cnt;
        }
        
        return answer;
    }
}