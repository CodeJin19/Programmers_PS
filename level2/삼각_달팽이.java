class Solution {
    public int[] solution(int n) {
        int[][] fld = new int[n][n];

        int y = 0;
        int x = 0;
        int num = 1;
        int limit = n * (n + 1) / 2;
        final int DOWN = 0;
        final int RIGHT = 1;
        final int UP = 2;
        int d = DOWN;
        int[] answer = new int[limit];

        while(num <= limit) {
            fld[y][x] = num++;

            switch(d) {
                case DOWN:
                    if(y + 1 < n && fld[y + 1][x] == 0) {
                        y++;
                    } else {
                        x++;
                        d = RIGHT;
                    }
                    break;
                case RIGHT :
                    if(x + 1 < n && fld[y][x + 1] == 0) {
                        x++;
                    } else {
                        y--;
                        x--;
                        d = UP;
                    }
                    break;
                case UP:
                    if(0 <= y - 1 && 0 <= x - 1 && fld[y - 1][x - 1] == 0) {
                        y--;
                        x--;
                    } else {
                        y++;
                        d = DOWN;
                    }
                    break;
            }
        }

        num = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                answer[num++] = fld[i][j];
            }
        }

        return answer;
    }
}