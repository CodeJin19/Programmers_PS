class Solution {
    public int solve(int num, int cnt) {
        if(num == 0) {
            return cnt;
        }
        
        int ret = Integer.MAX_VALUE;
        
        int r = num % 10;
        
        if (r < 5) {
            int tmp = solve(num / 10, cnt + r);
            ret = Math.min(ret, tmp);
        } else if(5 < r) {
            int tmp = solve((num / 10) + 1, cnt + (10 - r));
            ret = Math.min(ret, tmp);
        } else {
            int tmp = solve(num / 10, cnt + r);
            ret = Math.min(ret, tmp);
            tmp = solve((num / 10) + 1, cnt + (10 - r));
            ret = Math.min(ret, tmp);
        }
        
        return ret;
    }
    public int solution(int storey) {
        return solve(storey, 0);
    }
}