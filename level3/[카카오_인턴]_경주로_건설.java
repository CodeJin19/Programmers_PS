import java.util.*;

class Solution {
    static int d[][] = {{0, 1},{1, 0},{0, -1},{-1, 0}};
    
    class Node implements Comparable<Node> {
        public int y;
        public int x;
        public int dir;
        public int len;
        public int cnt;
        
        Node(int y, int x, int dir, int cnt, int len) {
            this.y = y;
            this.x = x;
            this.dir = dir;
            this.cnt = cnt;
            this.len = len;
        }
        
        @Override
        public int compareTo(Node o) {
            int p1 = this.cnt * 500 + this.len * 100;
            int p2 = o.cnt * 500 + o.len * 100;
            
            if(p1 <= p2)
                return -1;
            else
                return 1;
        }
    }
    
    public int solution(int[][] board) {
        PriorityQueue<Node> queue = new PriorityQueue();
        Node tmp;
        int cache[][][] = new int[board.length][board[0].length][4];
        int x, y, nx, ny, dir, cnt, len, p;
        int answer = Integer.MAX_VALUE;
        
        
        for(int i = 0; i < 4; i++)
            cache[0][0][i] = 0;
        
        if(board[0][1] == 0) {
            queue.offer(new Node(0, 1, 0, 0, 1));
            p = 100;
            cache[0][1][0] = p;
        }
        
        if(board[1][0] == 0) {
            queue.offer(new Node(1, 0, 1, 0, 1));
            p = 100;
            cache[1][0][1] = p;
        }
        
        while(!queue.isEmpty()) {
            tmp = queue.poll();
            y = tmp.y;
            x = tmp.x;
            dir = tmp.dir;
            cnt = tmp.cnt;
            len = tmp.len;
            p = len * 100 + cnt * 500;
            
            // System.out.println(y + " , " + x + " : " + p);
            
            if(y == board.length - 1 && x == board.length - 1) {
                answer = Math.min(answer, p);
                break;
            }
            
            if(answer < p) {
                continue;
            }
            
            for(int i = 0; i < 4; i++) {
                ny = y + d[i][0];
                nx = x + d[i][1];
                
                if(0 <= ny && ny < board.length && 0 <= nx && nx < board[0].length && board[ny][nx] != 1) {
                    if(dir != i) {
                        if(cache[ny][nx][i] == 0 || p + 600 < cache[ny][nx][i]) {
                            queue.offer(new Node(ny, nx, i, cnt + 1, len + 1));
                            cache[ny][nx][i] = p + 600;
                        }
                    } else {
                        if(cache[ny][nx][i] == 0 || p + 100< cache[ny][nx][i]) {
                            queue.offer(new Node(ny, nx, i, cnt, len + 1));
                            cache[ny][nx][i] = p + 100;
                        }
                    }
                }
            }
        }
        
        return answer;
    }
}