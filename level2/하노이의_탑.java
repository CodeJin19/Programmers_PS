class Solution {
    int idx;
    
    public void hanoi(int n, int from, int to, int tmp, int[][] answer) {
        if (n == 1) {
            answer[idx][0] = from;
            answer[idx][1] = to;
            idx++;
        } else {
            hanoi(n - 1, from, tmp, to, answer);
            answer[idx][0] = from;
            answer[idx][1] = to;
            idx++;
            hanoi(n -1, tmp, to, from, answer);
        }
    }
    
    public int[][] solution(int n) {
        int[][] answer;
        int len = 1;
        
        for(int i = 0; i < n; i++) {
            len *= 2;
        }
        
        len--;
        
        answer = new int[len][2];
        idx = 0;
        
        hanoi(n, 1, 3, 2, answer);
        
        return answer;
    }
}