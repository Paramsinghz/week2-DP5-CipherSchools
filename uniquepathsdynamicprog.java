class Solution {
    public int uniquePaths(int m, int n) {

        int dp[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }

        return paths(dp, m, n, 0, 0);

    }

    static int paths(int dp[][], int m, int n, int a, int b) {

        if (a >= m || b >= n)
            return 0;
        if (a == m - 1 && b == n - 1)
            return 1;

        if (dp[a][b] != -1)
            return dp[a][b];

        else
            return dp[a][b] = paths(dp, m, n, a + 1, b) + paths(dp, m, n, a, b + 1);

    }
}