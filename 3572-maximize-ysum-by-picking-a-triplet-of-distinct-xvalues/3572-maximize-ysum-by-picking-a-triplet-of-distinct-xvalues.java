class Solution {
    public int maxSumDistinctTriplet(int[] x, int[] y) {
        int[] maxY = new int[1000001];
        for (int i = 0; i < x.length; i++) {
            maxY[x[i]] = Math.max(maxY[x[i]], y[i]);
        }
        int a = 0, b = 0, c = 0;
        for (int i = 1; i <= 1000000; i++) {
            if (maxY[i] > a) {
                c = b;
                b = a;
                a = maxY[i];
            } else if (maxY[i] > b) {
                c = b;
                b = maxY[i];
            } else if (maxY[i] > c) {
                c = maxY[i];
            }
        }
        if (c == 0) return -1;
        return a + b + c;
    }
}