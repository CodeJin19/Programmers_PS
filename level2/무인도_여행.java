import java.util.*;

class Solution {
    public int[] solution(String[] maps) {
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> queueY;
        LinkedList<Integer> queueX;
        int[] answer;
        int h = maps.length;
        int w = maps[0].length();
        int[] dy = {1, 0, -1, 0};
        int[] dx = {0, 1, 0, -1};
        boolean[][] visited = new boolean[h][w];


        for(int y = 0; y < h; y++) {
            for(int x = 0; x < w; x++) {
                if(visited[y][x]) {
                    continue;
                } else {
                    if(maps[y].charAt(x) == 'X') {
                        visited[y][x] = true;
                    } else {
                        queueY = new LinkedList<>();
                        queueX = new LinkedList<>();
                        
                        queueY.add(y);
                        queueX.add(x);
                        visited[y][x] = true;
                        int sum = (int)(maps[y].charAt(x) - '0');
                        
                        while(!queueX.isEmpty()) {
                            int nowx = queueX.poll();
                            int nowy = queueY.poll();
                            
                            for(int i = 0; i < 4; i++) {
                                int ny = nowy + dy[i];
                                int nx = nowx + dx[i];
                                
                                if(ny < 0 || h <= ny || nx < 0 || w <= nx || maps[ny].charAt(nx) == 'X' || visited[ny][nx]) {
                                    continue;
                                }

                                queueY.add(ny);
                                queueX.add(nx);
                                visited[ny][nx] = true;
                                sum += (int)(maps[ny].charAt(nx) - '0');
                            }
                        }
                        
                        list.add(sum);
                    }
                }
            }
        }
        
        if(list.size() == 0) {
            answer = new int[] {-1};
        } else {
            answer = new int[list.size()];
        
            for(int i = 0; i < answer.length; i++) {
                answer[i] = list.get(i);
            }
            
            Arrays.sort(answer);
        }       

        return answer;
    }
}