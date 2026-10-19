class Solution {
    public int[] countOfPairs(int n, int x, int y) {
        int[] result = new int[n];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i != j) {
                    int d = Math.min(Math.abs(i - j), Math.abs(i - x) + 1 + Math.abs(j - y));
                    d = Math.min(d, Math.abs(i - y) + 1 + Math.abs(j - x));
                    result[d - 1]++;
                }
            }
        }
        return result;
    }
}