class Solution {
    public int maxCapacity(int[] costs, int[] capacity, int budget) {
        int n = costs.length, ans = 0;
        int[][] a = new int[n][2];
        for (int i = 0; i < n; i++) {
            a[i][0] = costs[i];
            a[i][1] = capacity[i];
            if (costs[i] < budget) ans = Math.max(ans, capacity[i]);
        }
        Arrays.sort(a, (x, y) -> x[0] - y[0]);
        int[] pref = new int[n], prefIdx = new int[n];
        pref[0] = a[0][1];
        prefIdx[0] = 0;
        for (int i = 1; i < n; i++) {
            if (a[i][1] > pref[i - 1]) {
                pref[i] = a[i][1];
                prefIdx[i] = i;
            } else {
                pref[i] = pref[i - 1];
                prefIdx[i] = prefIdx[i - 1];
            }
        }
        for (int i = 0; i < n; i++) {
            int limit = budget - a[i][0] - 1;
            int l = 0, r = n - 1, idx = -1;
            while (l <= r) {
                int mid = l + (r - l) / 2;
                if (a[mid][0] <= limit) {
                    idx = mid;
                    l = mid + 1;
                } else r = mid - 1;
            }
            if (idx < 0) continue;
            int best = pref[idx];
            if (prefIdx[idx] == i) {
                best = 0;
                for (int j = idx; j >= 0; j--) {
                    if (j != i) {
                        best = Math.max(best, a[j][1]);
                        break;
                    }
                }
            }
            ans = Math.max(ans, a[i][1] + best);
        }
        return ans;
    }
}