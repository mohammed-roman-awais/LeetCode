class Solution {
    private String ans = "";

    public String largestTimeFromDigits(int[] arr) {
        boolean[] used = new boolean[4];
        dfs(arr, used, new int[4], 0);
        return ans;
    }

    private void dfs(int[] arr, boolean[] used, int[] perm, int idx) {
        if (idx == 4) {
            int hour = perm[0] * 10 + perm[1];
            int minute = perm[2] * 10 + perm[3];

            if (hour < 24 && minute < 60) {
                String time = String.format("%02d:%02d", hour, minute);
                if (ans.isEmpty() || time.compareTo(ans) > 0) {
                    ans = time;
                }
            }
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (!used[i]) {
                used[i] = true;
                perm[idx] = arr[i];
                dfs(arr, used, perm, idx + 1);
                used[i] = false;
            }
        }
    }
}