class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int line[] = new int[210];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i < 3; i++) {
            int from = lines[i][0] + 100;
            int to = lines[i][1] + 100;
            
            min = from < min ? from : min;
            max = max < to ? to : max;
            
            for(int j = from ; j < to; j++)
                line[j]++;
        }
        
        for(int i = min; i <= max; i++) {
            if(1 < line[i]) {
                answer++;
            }
        }
        return answer;
    }
}