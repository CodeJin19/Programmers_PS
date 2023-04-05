class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int lux = Integer.MAX_VALUE;
        int luy = Integer.MAX_VALUE;
        int rdx = Integer.MIN_VALUE;
        int rdy = Integer.MIN_VALUE;

        for(int i = 0; i < wallpaper.length; i++) {
            int len = wallpaper[0].length();

            for(int j = 0; j < len; j++) {
                if(wallpaper[i].charAt(j) == '#') {
                    luy = Math.min(luy, i);
                    lux = Math.min(lux, j);
                    rdy = Math.max(rdy, i + 1);
                    rdx = Math.max(rdx, j + 1);
                }
            }
        }

        answer[0] = luy;
        answer[1] = lux;
        answer[2] = rdy;
        answer[3] = rdx;

        return answer;
    }
}