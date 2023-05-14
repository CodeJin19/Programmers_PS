class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int val = 0;
        
        if(ineq.charAt(0) == '>') {
            if(eq.charAt(0) == '=') {
                val = 0;
            } else {
                val = 2;
            }
        } else {
            if(eq.charAt(0) == '=') {
                val = 1;
            } else {
                val = 3;
            }
        }
        
        switch(val) {
            case 0:
                if(n >= m) {
                    return 1;
                } else {
                    return 0;
                }
            case 1:
                if(n <= m) {
                    return 1;
                } else {
                    return 0;
                }
            case 2:
                if(n > m) {
                    return 1;
                } else {
                    return 0;
                }
            case 3:
                if(n < m) {
                    return 1;
                } else {
                    return 0;
                }
        }
        
        return 0;
    }
}