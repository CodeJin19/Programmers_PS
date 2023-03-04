class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        int xLen = X.length();
        int yLen = Y.length();
        int[] xCnt = new int[10];
        int[] yCnt = new int[10];
        boolean zeroOnly = true;

        for(int i = 0; i < xLen; i++) {
            int idx = (int) (X.charAt(i) - '0');
            xCnt[idx]++;
        }

        for(int i = 0; i < yLen; i++) {
            int idx = (int) (Y.charAt(i) - '0');
            yCnt[idx]++;
        }

        for(int i = 9; 0 <= i; i--) {
            int min = Math.min(xCnt[i], yCnt[i]);
            
            if(0 < min && i != 0) {
                zeroOnly = false;
            }

            for(int j = 0; j < min; j++) {
                answer.append(i);
            }
        }

        if(zeroOnly) {
            if(answer.length() == 0) {
                return "-1";
            } else {
                return "0";
            }
        }

        return answer.toString();
    }
}