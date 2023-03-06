class Solution {
    public int bruteForceSearch(int k, int idx, int[][] dungeons, boolean[] visited) {
        if(k < dungeons[idx][0]) {
            return 0;
        }
        
        int ret = 1;
        int d = 0;
        
        for(int i = 0; i < visited.length; i++) {
            if(visited[i]) {
                continue;
            }
            
            visited[i] = true;
            d = Math.max(d, bruteForceSearch(k - dungeons[idx][1], i, dungeons, visited));
            visited[i] = false;
        }
        
        return ret + d;
    }
    
    public int solution(int k, int[][] dungeons) {
        int answer = 0;
        boolean[] visited = new boolean[dungeons.length];
        
        for(int i = 0; i < dungeons.length; i++) {
            visited[i] = true;
            answer = Math.max(answer, bruteForceSearch(k, i, dungeons, visited));
            visited[i] = false;
        }
        
        return answer;
    }
}