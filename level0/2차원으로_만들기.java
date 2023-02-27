class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        int idx = 0;
        
        for(int i = 0; i < num_list.length;) {
            int[] tmp = new int[n];
            
            for(int j = 0; j < n; j++) {
                tmp[j] = num_list[i++];
            }
            
            answer[idx++] = tmp;
        }
        
        return answer;
    }
}