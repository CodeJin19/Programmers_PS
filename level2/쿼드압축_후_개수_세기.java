class Solution {
    static int one;
    static int zero;
    
    public void check(int[][] arr, int y, int x, int len) {
        int num = arr[y][x];
        boolean flag = false;
        
        for(int i = y; i < y + len; i++) {
            for(int j = x;j < x + len; j++) {
                if(arr[i][j] != num) {
                    flag = true;
                    i = y + len;
                    j = x + len;
                }
            }
        }
        
        if(flag) {
            check(arr, y, x, len / 2);
            check(arr, y, x + (len / 2), len / 2);
            check(arr, y + (len / 2), x, len / 2);
            check(arr, y + (len / 2), x + (len / 2), len / 2);
        } else {
            if(arr[y][x] == 0) {
                zero++;
            } else if(arr[y][x] == 1) {
                one++;
            }
        }
    }
    
    public int[] solution(int[][] arr) {
        int[] answer = new int[2];
        int len = arr.length;
        one = 0;
        zero = 0;
        
        check(arr, 0, 0, len);
        
        answer[0] = zero;
        answer[1] = one;
        
        return answer;
    }
}
