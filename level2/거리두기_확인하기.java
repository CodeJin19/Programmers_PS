import java.util.*;

class Solution {
    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];
        int[] dy = {1, 0, -1, 0};
        int[] dx = {0, 1, 0, -1};
        int y, x, ny, nx, l;

        for(int tc = 0; tc < places.length; tc++) {
            Queue<int[]> seats = new LinkedList<>();
            boolean exit = false;

            for(int i = 0; i < 5; i++) {
                for(int j = 0; j < 5; j++) {
                    if(places[tc][i].charAt(j) == 'P') {
                        int[] tmp = new int[3];
                        tmp[0] = i;
                        tmp[1] = j;
                        tmp[2] = 0;

                        seats.offer(tmp);
                    }
                }
            }

            while(!exit && !seats.isEmpty()) {
                Queue<int[]> queue = new LinkedList<>();
                boolean[][] visited = new boolean[5][5];

                int[] tmp = seats.poll();
                y = tmp[0];
                x = tmp[1];
                visited[y][x] = true;
                queue.offer(tmp);

                while(!exit && !queue.isEmpty()) {
                    tmp = queue.poll();
                    y = tmp[0];
                    x = tmp[1];
                    l = tmp[2];

                    if(l == 2) {
                        continue;
                    }

                    for(int i = 0; i < 4; i++) {
                        ny = y + dy[i];
                        nx = x + dx[i];

                        if(ny < 0 || 5 <= ny || nx < 0 || 5 <= nx || visited[ny][nx]) {
                            continue;
                        }
                        
                        if(places[tc][ny].charAt(nx) == 'O') {
                            tmp = new int[3];
                            tmp[0] = ny;
                            tmp[1] = nx;
                            tmp[2] = l + 1;
                            queue.offer(tmp);
                            visited[ny][nx] = true;
                        } else if(places[tc][ny].charAt(nx) == 'P') {
                            exit = true;
                            break;
                        }
                    }
                }
            }

            if(exit) {
                answer[tc] = 0;
            } else {
                answer[tc] = 1;
            }
        }

        return answer;
    }
}