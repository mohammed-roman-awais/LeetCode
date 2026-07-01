class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        int[][] cnt = new int[n][11];

        for (int[] p : pick) {
            cnt[p[0]][p[1]]++;
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int color = 0; color <= 10; color++) {
                if (cnt[i][color] > i) {
                    ans++;
                    break;
                }
            }
        }

        return ans;
    }
}