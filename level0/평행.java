class Solution {
    public int solution(int[][] dots) {
        int dx1, dx2, dy1, dy2;
        double d1, d2;
        
        for(int i = 1; i < 4; i++) {
            dx1 = dots[0][0] - dots[i][0];
            dy1 = dots[0][1] - dots[i][1];
            
            dx2 = 0;
            dy2 = 0;
            
            for(int j = 1; j < 4; j++) {
                if(j == i)
                    continue;
                
                for(int k = 1; k < 4; k++) {
                    if(k == i || k == j)
                        continue;
                    
                    dx2 = dots[j][0] - dots[k][0];
                    dy2 = dots[j][1] - dots[k][1];
                    
                    j = 4;
                    k = 4;
                }
            }
            
            d1 = dy1;
            d1 /= dx1;
            
            d2 = dy2;
            d2 /= dx2;
            
            if(d1 == d2)
                return 1;
        }
        
        return 0;
    }
}