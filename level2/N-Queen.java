class Solution {
    public int solution(int n) {
        int answer = 0;
        int cache[] = new int[n];
        
        for(int i = 0; i < n; i++) {
            cache[0] = i;
            answer += nQueen(1, cache);
        }
        
        return answer;
    }
    
    public int nQueen(int idx, int cache[]) {
        if(idx == cache.length)
            return 1;
        
        int ret = 0;
        
        for(int i = 0; i < cache.length; i++) {
            cache[idx] = i;
            
            if(isPossible(cache, idx))
                ret += nQueen(idx + 1, cache);
        }
        
        return ret;
    }
    
    public boolean isPossible(int cache[], int y) {
        for(int i = 0; i < y; i++) {
            if(cache[y] == cache[i])
                return false;
            
            if(Math.abs(cache[y] - cache[i]) == Math.abs(y - i))
                return false;
        }
        
        return true;
    }
}