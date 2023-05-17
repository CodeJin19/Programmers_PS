import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        Queue<int[]> queue = new LinkedList<>();
        int[][] minLen = new int[maps.length][maps[0].length];
        int[][] d = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        int y = 0;
        int x = 0;
        int l, ny, nx;

        for(int i = 0; i < maps.length; i++) {
            for(int j = 0; j < maps[0].length; j++) {
                minLen[i][j] = -1;
            }
        }

        minLen[y][x] = 1;
        queue.offer(new int[] {y, x, 1});

        while(!queue.isEmpty()) {
            int[] now = queue.poll();

            y = now[0];
            x = now[1];
            l = now[2];

            for(int i = 0; i < 4; i++) {
                ny = y + d[i][0];
                nx = x + d[i][1];

                if(ny < 0 || maps.length <= ny || nx < 0 || maps[0].length <= nx || maps[ny][nx] == 0) {
                    continue;
                }

                if(minLen[ny][nx] == -1 || l + 1 < minLen[ny][nx]) {
                    queue.offer(new int[] {ny, nx, l + 1});
                    minLen[ny][nx] = l + 1;
                }
            }
        }

        return minLen[minLen.length - 1][minLen[0].length - 1];
    }
}