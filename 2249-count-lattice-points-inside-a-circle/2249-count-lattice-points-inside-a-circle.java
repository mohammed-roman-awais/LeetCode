class Solution {
    public int countLatticePoints(int[][] circles) {
        int count = 0;

        for (int x = 0; x <= 200; x++) {
            for (int y = 0; y <= 200; y++) {

                for (int[] circle : circles) {
                    int cx = circle[0];
                    int cy = circle[1];
                    int r = circle[2];

                    int dx = x - cx;
                    int dy = y - cy;

                    if (dx * dx + dy * dy <= r * r) {
                        count++;
                        break; 
                    }
                }
            }
        }

        return count;
    }
}