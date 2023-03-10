class Solution {
    public int solution(int m, int n, int[][] puddles) {
		int cnt[][] = new int[n][m];
		boolean fld[][] = new boolean[n][m];

		for (int i = 0; i < puddles.length; i++) {
			int y = puddles[i][1] - 1;
			int x = puddles[i][0] - 1;

			fld[y][x] = true;
		}

		for (int i = 0; i < n; i++)
			if (fld[i][0])
				break;
			else
				cnt[i][0] = 1;

		for (int j = 0; j < m; j++)
			if (fld[0][j])
				break;
			else
				cnt[0][j] = 1;

		for (int i = 1; i < n; i++)
			for (int j = 1; j < m; j++)
				if (!fld[i][j])
					cnt[i][j] = (cnt[i - 1][j] + cnt[i][j - 1]) % 1000000007;

		return cnt[n - 1][m - 1];
    }
}