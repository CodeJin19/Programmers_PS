class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int n = board.length;
        int[][] newBoard = new int[n][n];
        int[] dy = {-1, -1, -1, 0, 1, 1, 1, 0};
        int[] dx = {-1, 0, 1, 1, 1, 0, -1, -1};

        for(int i = 0; i < n; i++) {
            for(int j= 0; j < n; j++) {
                newBoard[i][j] = 1;
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j= 0; j < n; j++) {
                if(board[i][j] == 1) {
                    newBoard[i][j] = 0;
                    int y = i;
                    int x = j;

                    for(int k = 0; k < 8; k++) {
                        int ny = y + dy[k];
                        int nx = x + dx[k];

                        if(0 <= ny && ny < n && 0 <= nx && nx < n) {
                            newBoard[ny][nx] = 0;
                        }
                    }
                }
            }
        }
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                answer += newBoard[i][j];
            }
        }
        return answer;
    }
}