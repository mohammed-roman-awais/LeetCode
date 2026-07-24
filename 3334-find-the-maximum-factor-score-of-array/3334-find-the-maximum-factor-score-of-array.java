class Solution {
    public long maxScore(int[] nums) {
        int n = nums.length;

        long[] preLcm = new long[n + 1];
        long[] sufLcm = new long[n + 1];
        long[] preGcd = new long[n + 1];
        long[] sufGcd = new long[n + 1];

        preLcm[0] = 1;
        preGcd[0] = 0;
        for (int i = 0; i < n; i++) {
            preGcd[i + 1] = gcd(preGcd[i], nums[i]);
            preLcm[i + 1] = lcm(preLcm[i], nums[i]);
        }

        sufLcm[n] = 1;
        sufGcd[n] = 0;
        for (int i = n - 1; i >= 0; i--) {
            sufGcd[i] = gcd(sufGcd[i + 1], nums[i]);
            sufLcm[i] = lcm(sufLcm[i + 1], nums[i]);
        }

        long ans = preGcd[n] * preLcm[n];

        for (int i = 0; i < n; i++) {
            long g = gcd(preGcd[i], sufGcd[i + 1]);
            long l = lcm(preLcm[i], sufLcm[i + 1]);
            ans = Math.max(ans, g * l);
        }

        return ans;
    }

    private long gcd(long a, long b) {
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    private long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }
}