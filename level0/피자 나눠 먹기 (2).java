class Solution {
    public int getLCM(int num1, int num2) {
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

        return num1 / x * num2;
    }
    
    public int solution(int n) {
        return getLCM(n, 6) / 6;
    }
}