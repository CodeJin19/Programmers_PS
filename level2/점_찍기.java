class Solution {
    public int getX(int y, int d) {
        double dy = (double) y;
        double dd = (double) d;
        
        dd = dd * dd;
        dy = dy * dy;
        
        double tmp = dd - dy;
        tmp = Math.sqrt(tmp);
        
        int ret = (int) tmp;
        
        return ret;
    }
    
    public long solution(int k, int d) {
        long answer = 0;
        
        for(int y = 0; y <= d;) {
            int x = getX(y, d);
            
            answer += ((x / k) + 1);
            
            y += k;
        }
        
        return answer;
    }
}