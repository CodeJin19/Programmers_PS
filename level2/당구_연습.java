class Solution {
    public int[] solution(int m, int n, int startX, int startY, int[][] balls) {
        int[] answer = new int[balls.length];
        int nx, ny, tx, ty;

        for(int i = 0; i < balls.length; i++) {
            int minVal = Integer.MAX_VALUE;
            int l;
            ty = balls[i][1];
            tx = balls[i][0];

            if(tx != startX) {// 위 아래
                ny = n + n - ty;
                nx = tx;
                l = (int)(Math.pow(Math.abs(ny - startY), 2) + Math.pow(Math.abs(nx - startX), 2));
                minVal = Math.min(minVal, l);

                ny = 0 - ty;
                nx = tx;
                l = (int)(Math.pow(Math.abs(ny - startY), 2) + Math.pow(Math.abs(nx - startX), 2));
                minVal = Math.min(minVal, l);
            }

            if(tx == startX) {
                if(startY < ty) {
                    ny = 0 - ty;
                    nx = tx;
                    l = (int)(Math.pow(Math.abs(ny - startY), 2) + Math.pow(Math.abs(nx - startX), 2));
                    minVal = Math.min(minVal, l);
                } else {
                    ny = n + n - ty;
                    nx = tx;
                    l = (int)(Math.pow(Math.abs(ny - startY), 2) + Math.pow(Math.abs(nx - startX), 2));
                    minVal = Math.min(minVal, l);
                }
            }

            if(ty != startY) { // 왼쪽 오른쪽
                ny = ty;
                nx = m + m - tx;
                l = (int)(Math.pow(Math.abs(ny - startY), 2) + Math.pow(Math.abs(nx - startX), 2));
                minVal = Math.min(minVal, l);

                ny = ty;
                nx = 0 - tx;
                l = (int)(Math.pow(Math.abs(ny - startY), 2) + Math.pow(Math.abs(nx - startX), 2));
                minVal = Math.min(minVal, l);
            }

            if(ty == startY) {
                if(startX < tx) {
                    ny = ty;
                    nx = 0 - tx;
                    l = (int)(Math.pow(Math.abs(ny - startY), 2) + Math.pow(Math.abs(nx - startX), 2));
                    minVal = Math.min(minVal, l);
                } else {
                    ny = ty;
                    nx = m + m - tx;
                    l = (int)(Math.pow(Math.abs(ny - startY), 2) + Math.pow(Math.abs(nx - startX), 2));
                    minVal = Math.min(minVal, l);
                }
            }

            answer[i] = minVal;
        }

        return answer;
    }
}