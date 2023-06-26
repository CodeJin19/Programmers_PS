import java.util.*;

class Solution {
    public int bfs(String[] maps, char from, char to) {
        int[] dy = {1, 0, -1, 0};
        int[] dx = {0, 1, 0, -1};
        int[] tmp;
        int h = maps.length;
        int w = maps[0].length();
        int sy = 0;
        int sx = 0;
        int y, x;
        int val = 0;
        boolean[][] visited = new boolean[h][w];
        int[][] lenArr = new int[h][w];
        Queue<int[]> queue = new LinkedList<>();

        for(int i = 0; i < h; i++) {
            for(int j = 0; j < w; j++) {
                if(maps[i].charAt(j) == from) {
                    sy = i;
                    sx = j;
                    i = h;
                    j = w;
                }
            }
        }

        tmp = new int[2];
        tmp[0] = sy;
        tmp[1] = sx;
        visited[sy][sx] = true;
        lenArr[sy][sx] = val;
        queue.offer(tmp);

        while(!queue.isEmpty()) {
            tmp = queue.poll();
            y = tmp[0];
            x = tmp[1];
            val = lenArr[y][x];

            for(int i = 0; i < 4; i++) {
                int ny = y + dy[i];
                int nx = x + dx[i];

                if(ny < 0 || h <= ny || nx < 0 || w <= nx || maps[ny].charAt(nx) == 'X' || visited[ny][nx]) {
                    continue;
                }

                if(maps[ny].charAt(nx) == to) {
                    return val + 1;
                } else {
                    tmp = new int[2];
                    tmp[0] = ny;
                    tmp[1] = nx;
                    visited[ny][nx] = true;
                    lenArr[ny][nx] = val + 1;
                    queue.offer(tmp);
                }
            }
        }

        return -1;
    }

    public int solution(String[] maps) {
        int StoL = bfs(maps, 'S', 'L');
        int LtoE = bfs(maps, 'L', 'E');

        if(StoL == -1 || LtoE == -1) {
            return -1;
        } else {
            return StoL + LtoE;
        }
    }
}

/*
public int solution(String[] maps) {
        int[] dy = {1, 0, -1, 0};
        int[] dx = {0, 1, 0, -1};
        int[] tmp;
        int h = maps.length;
        int w = maps[0].length();
        int y = 0;
        int x = 0;
        int sx = 0;
        int sy = 0;
        int ly = 0;
        int lx = 0;
        int ey = 0;
        int ex = 0;
        int val = 0;
        boolean flag;
        boolean[][] visited = new boolean[h][w];
        int[][] lenArr = new int[h][w];
        Queue<int[]> queue;

        for(int i = 0; i < h; i++) {
            for(int j = 0; j < w; j++) {
                if(maps[i].charAt(j) == 'S') {
                    sy = i;
                    sx = j;
                    i = h;
                    j = w;
                }
            }
        }

        queue = new LinkedList<>();
        tmp = new int[2];
        tmp[0] = sy;
        tmp[1] = sx;
        visited[sy][sx] = true;
        lenArr[sy][sx] = val;
        queue.offer(tmp);
        flag = false;

        while(!queue.isEmpty()) {
            tmp = queue.poll();
            y = tmp[0];
            x = tmp[1];
            val = lenArr[y][x];

            for(int i = 0; i < 4; i++) {
                int ny = y + dy[i];
                int nx = x + dx[i];

                if(ny < 0 || h <= ny || nx < 0 || w <= nx || maps[ny].charAt(nx) == 'X') {
                    continue;
                }

                if(visited[ny][nx] && lenArr[ny][nx] != 0 && lenArr[ny][nx] <= val + 1) {
                    continue;
                }

                if(maps[ny].charAt(nx) == 'O' || maps[ny].charAt(nx) == 'E') {
                    tmp = new int[2];
                    tmp[0] = ny;
                    tmp[1] = nx;
                    visited[ny][nx] = true;
                    lenArr[ny][nx] = val + 1;
                    queue.offer(tmp);
                } else if(maps[ny].charAt(nx) == 'L') {
                    ly = ny;
                    lx = nx;
                    visited[ly][lx] = true;
                    val++;
                    flag = true;
                    while(!queue.isEmpty()) {
                        queue.poll();
                    }
                    break;
                }
            }
        }

        if(!flag) {
            return -1;
        }

        visited = new boolean[h][w];
        lenArr = new int[h][w];
        visited[ly][lx] = true;
        lenArr[ly][lx] = val;
        queue = new LinkedList<>();
        tmp = new int[2];
        tmp[0] = ly;
        tmp[1] = lx;
        queue.offer(tmp);
        flag = false;

        while(!queue.isEmpty()) {
            tmp = queue.poll();
            y = tmp[0];
            x = tmp[1];
            val = lenArr[y][x];

            for(int i = 0; i < 4; i++) {
                int ny = y + dy[i];
                int nx = x + dx[i];

                if(ny < 0 || h <= ny || nx < 0 || w <= nx || maps[ny].charAt(nx) == 'X') {
                    continue;
                }

                if(visited[ny][nx] && lenArr[ny][nx] != 0 && lenArr[ny][nx] <= val + 1) {
                    continue;
                }

                if(maps[ny].charAt(nx) == 'O' || maps[ny].charAt(nx) == 'L') {
                    tmp = new int[2];
                    tmp[0] = ny;
                    tmp[1] = nx;
                    visited[ny][nx] = true;
                    lenArr[ny][nx] = val + 1;
                    queue.offer(tmp);
                } else if(maps[ny].charAt(nx) == 'E') {
                    ey = ny;
                    ex = nx;
                    visited[ey][ex] = true;
                    lenArr[ey][ex] = val + 1;
                    flag = true;
                    while(!queue.isEmpty()) {
                        queue.poll();
                    }
                    break;
                }
            }
        }

        if(flag) {
            return lenArr[ey][ex];
        } else {
            return -1;
        }
    }
*/