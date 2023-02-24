class Solution {
    public int solution(int balls, int share) {
        int[][] fld = new int[31][31];
        int max = 0;

        fld[0][0] = 1;
        fld[1][0] = 1;
        fld[1][1] = 1;

        for(int i = 2; i <= balls; i++) {
            max = i <= share ? share : i;
            fld[i][0] = 1;

            for(int j = 1; j <= max; j++) {
                fld[i][j] = fld[i - 1][j - 1] + fld[i - 1][j];
            }
        }

        return fld[balls][share];
    }
}