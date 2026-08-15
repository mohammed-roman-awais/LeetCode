class Solution {
    public int longestPalindrome(String s, String t) {
        int m = s.length();
        int n = t.length();
        int[] palS = getPalindromeLengths(s, true);
        int[] palT = getPalindromeLengths(t, false);
        int ans = 1;
        for (int x : palS) {
            ans = Math.max(ans, x);
        }
        for (int x : palT) {
            ans = Math.max(ans, x);
        }
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = n - 1; j >= 0; j--) {
                if (s.charAt(i) == t.charAt(j)) {
                    dp[i][j] = 2;
                    if (i > 0 && j < n - 1) {
                        dp[i][j] += dp[i - 1][j + 1];
                    }
                    int extra = 0;
                    if (i + 1 < m) {
                        extra = Math.max(extra, palS[i + 1]);
                    }
                    if (j > 0) {
                        extra = Math.max(extra, palT[j - 1]);
                    }
                    ans = Math.max(ans, dp[i][j] + extra);
                }
            }
        }
        return ans;
    }
    private int[] getPalindromeLengths(String str, boolean suffix) {
        int n = str.length();
        int[] result = new int[n];
        boolean[][] dp = new boolean[n][n];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                if (str.charAt(i) == str.charAt(j) &&
                    (j - i <= 2 || dp[i + 1][j - 1])) {
                    dp[i][j] = true;
                    int index = suffix ? i : j;
                    result[index] = Math.max(
                        result[index],
                        j - i + 1
                    );
                }
            }
        }
        return result;
    }
}