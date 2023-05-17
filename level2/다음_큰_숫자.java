class Solution {
    public int solution(int n) {
        int answer = 0;
        int ones = 0;
        int num = n + 1;

        while(n != 0) {
            if(n % 2 == 1) {
                ones++;
            }

            n /= 2;
        }
        
        while(true) {
            int x = num;
            int xOnes = 0;
            
            while(x != 0) {
                if(x % 2 == 1) {
                    xOnes++;
                }
                
                x /= 2;
            }
            
            if(ones == xOnes)
                return num;
            
            num++;
        }
    }
}