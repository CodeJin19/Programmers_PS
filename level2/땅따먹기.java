class Solution {
    int solution(int[][] land) {
        int answer = 0;
        int[] p = new int[4];
        int[] n = new int[4];

        for(int i = 0; i < 4; i++) {
            p[i] = 0;
        }

        for(int i = 0; i < land.length; i++) {
            for(int j = 0; j < 4; j++) {
                int max = 0;

                for(int k = 0; k < 4; k++) {
                    if(k == j) {
                        continue;
                    }

                    max = Math.max(max, p[k]);
                }

                n[j] = land[i][j] + max;
            }

            for(int j = 0; j < 4; j++) {
                p[j] = n[j];
            }
        }

        for(int i = 0; i < 4; i++) {
            answer = Math.max(answer, n[i]);
        }

        return answer;
    }
}