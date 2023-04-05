import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[][] fld = new int[park.length][park[0].length()];
        int[] answer = new int[2];
        int[] dy = {1, 0, -1, 0};
        int[] dx = {0, 1, 0, -1};
        int y = 0;
        int x = 0;
        int d, l;
        final int S = 0;
        final int E = 1;
        final int N = 2;
        final int W = 3;
        char dir;

        for(int i = 0; i < fld.length; i++) {
            for(int j = 0; j < fld[0].length; j++) {
                if(park[i].charAt(j) == 'O') {
                    fld[i][j] = 0;
                } else if(park[i].charAt(j) == 'X') {
                    fld[i][j] = 1;
                } else if(park[i].charAt(j) == 'S') {
                    y = i;
                    x = j;
                }
            }
        }

        for(int i = 0; i < routes.length; i++) {
            boolean flag = true;
            StringTokenizer st = new StringTokenizer(routes[i]);
            dir = st.nextToken().charAt(0);
            d = 0;

            if(dir == 'S') {
                d = S;
            } else if(dir == 'E') {
                d = E;
            } else if(dir == 'N') {
                d = N;
            } else if(dir == 'W') {
                d = W;
            }

            l = Integer.parseInt(st.nextToken());
            int ny = y + l * dy[d];
            int nx = x + l * dx[d];

            if(ny < 0 || fld.length <= ny || nx < 0 || fld[0].length <= nx) {
                continue;
            }

            ny = y;
            nx = x;

            for(int j = 1; j <= l; j++) {
                ny += dy[d];
                nx += dx[d];

                if(fld[ny][nx] == 1) {
                    flag = false;
                    break;
                }
            }

            if(flag) {
                y = ny;
                x = nx;
            }
        }

        answer[0] = y;
        answer[1] = x;

        return answer;
    }
}