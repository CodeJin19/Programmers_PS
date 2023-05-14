class Solution {
    public int solution(int a, int b) {
        int ab = a;
        int ba = b;
        int tmp = b;
        
        while(tmp != 0) {
            tmp /= 10;
            ab *= 10;
        }
        
        ab += b;
        
        tmp = a;
        
        while(tmp != 0) {
            tmp /= 10;
            ba *= 10;
        }
        
        ba += a;
        
        if(ab < ba) {
            return ba;
        } else {
            return ab;
        }
    }
}