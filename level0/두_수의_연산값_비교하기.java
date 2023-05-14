class Solution {
    public int solution(int a, int b) {
        int ab = a;
        int tmp = b;
        
        while(tmp != 0) {
            tmp /= 10;
            ab *= 10;
        }
        
        ab += b;
        
        tmp = 2 * a * b;
        
        if(ab < tmp) {
            return tmp;
        } else {
            return ab;
        }
    }
}