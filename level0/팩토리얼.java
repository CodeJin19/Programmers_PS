class Solution {
    public int solution(int n) {
        if(n == 3628800)
            return 10;
        else if(362880 <= n)
            return 9;
        else if(40320 <= n) 
            return 8;
        else if(5040 <= n)
            return 7;
        else if(720 <= n)
            return 6;
        else if(120 <= n)
            return 5;
        else if(24 <= n)
            return 4;
        else if(6 <= n)
            return 3;
        else if(2 <= n)
            return 2;
        else
            return 1;
    }
}