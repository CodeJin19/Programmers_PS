class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        int fld[][] = new int[rows][columns];
        int num = 1;
        
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                fld[i][j] = num++;
            }
        }
        
        for(int i = 0; i < queries.length; i++) {
            int y1 = queries[i][0] - 1;
            int x1 = queries[i][1] - 1;
            int y2 = queries[i][2] - 1;
            int x2 = queries[i][3] - 1;
            
            int y = y1;
            int x = x1 + 1;
            int dir = 1;
            int prev = fld[y1][x1];
            int now;
            int min = prev;
            
            while(y != y1 || x != x1) {
                now = fld[y][x];
                fld[y][x] = prev;
                prev = now;
                
                min = Math.min(min, prev);
                
                switch(dir) {
                    case 1:
                        if(x == x2) {
                            y++;
                            dir = 2;
                        } else {
                            x++;
                        }
                        break;
                    case 2:
                        if(y == y2) {
                            x--;
                            dir = 3;
                        } else {
                            y++;
                        }
                        break;
                    case 3:
                        if(x == x1) {
                            y--;
                            dir = 4;
                        } else {
                            x--;
                        }
                        break;
                    case 4:
                        if(y == y1) {
                            x++;
                            dir = 1;
                        } else {
                            y--;
                        }
                        break;
                }
            }
            
            fld[y][x] = prev;
            
            answer[i] = min;
        }
        
        return answer;
    }
}
