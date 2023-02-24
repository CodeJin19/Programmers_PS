class Solution {
    
    public int getGCD(int num1, int num2) {
        if(num1 == num2)
            return num1;

        int y = num1 < num2 ? num2 : num1;
        int x = num1 < num2 ? num1 : num2;
        int r = y % x;

        while(r != 0) {
            y = x;
            x = r;
            r = y % x;
        }

        return x;
    }
    
    public int solution(int a, int b) {
        int gcd = getGCD(a, b);

        a /= gcd;
        b /= gcd;

        while(b % 2 == 0) {
            b /= 2;
        }

        while(b % 5 == 0) {
            b /= 5;
        }

        if(b == 1) {
            return 1;
        } else {
            return 2;
        }
    }
}