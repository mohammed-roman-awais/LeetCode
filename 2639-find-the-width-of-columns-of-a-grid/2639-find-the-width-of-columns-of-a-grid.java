class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] ans = new int[n];
        for (int j = 0; j < n; j++) {
            int maxWidth = 0;
            for (int i = 0; i < m; i++) {
                maxWidth = Math.max(maxWidth, String.valueOf(grid[i][j]).length());
            }
            ans[j] = maxWidth;
        }
        return ans;
    }
}