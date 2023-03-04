class Solution {
    public int solution(int[][] dots) {
        int x1 = dots[0][0];
        int y1 = dots[0][1];
        int w = 0;
        int h = 0;

        for(int i = 1; i < 4; i++) {
            if(dots[i][0] == x1)
                h = Math.abs(y1 - dots[i][1]);
            
            if(dots[i][1] == y1)
                w =  Math.abs(x1 - dots[i][0]);
        }

        return w * h;
    }
}