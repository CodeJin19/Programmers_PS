class Solution {
    public int solution(String dirs) {
        int answer = 0;
        int[][] fld = new int[21][21];
        int y = 10;
        int x = 10;
        int len = dirs.length();

        for(int i = 0; i < len; i++) {
            char c = dirs.charAt(i);

            switch(c) {
                case 'U' :
                    if(y != 0) {
                        y--;
                        fld[y][x] = 1;
                        y--;
                    }
                    break;
                case 'D' :
                    if(y != 20) {
                        y++;
                        fld[y][x] = 1;
                        y++;
                    }
                    break;
                case 'R' :
                    if(x != 20) {
                        x++;
                        fld[y][x] = 1;
                        x++;
                    }
                    break;
                case 'L' :
                    if(x != 0) {
                        x--;
                        fld[y][x] = 1;
                        x--;
                    }
                    break;
            }
        }

        for(int i = 0; i < fld.length; i++) {
            for(int j = 0; j < fld[0].length; j++) {
                answer += fld[i][j];
            }
        }

        return answer;
    }
}