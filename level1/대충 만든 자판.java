class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int[] map = new int[26];
        int len, cnt;
        
        for(int i = 0; i < 26; i++) {
            map[i] = -1;
        }
        
        for(int i = 0; i < keymap.length; i++) {
            len = keymap[i].length();
            
            for(int j = 0; j < len; j++) {
                int idx = (int)(keymap[i].charAt(j) - 'A');
                
                if(map[idx] < 0) {
                    map[idx] = j + 1;
                } else {
                    map[idx] = Math.min(j + 1, map[idx]);
                }
            }
        }
        
        for(int i = 0; i < targets.length; i++) {
            len = targets[i].length();
            cnt = 0;
            
            for(int j = 0; j < len; j++) {
                int idx = (int)(targets[i].charAt(j) - 'A');
                
                if(map[idx] < 0) {
                    cnt = -1;
                    break;
                } else {
                    cnt += map[idx];
                }
            }
            
            answer[i] = cnt;
        }
        
        return answer;
    }
}