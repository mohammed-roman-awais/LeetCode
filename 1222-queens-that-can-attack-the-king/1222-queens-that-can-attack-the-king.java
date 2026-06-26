class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {

        boolean[][] board = new boolean[8][8];

        for (int[] q : queens) {
            board[q[0]][q[1]] = true;
        }

        List<List<Integer>> ans = new ArrayList<>();

        int[][] dir = {
            {-1, 0}, 
            {1, 0},  
            {0, -1}, 
            {0, 1},  
            {-1, -1},
            {-1, 1}, 
            {1, -1}, 
            {1, 1}   
        };

        for (int[] d : dir) {
            int x = king[0];
            int y = king[1];

            while (true) {
                x += d[0];
                y += d[1];

                if (x < 0 || x >= 8 || y < 0 || y >= 8)
                    break;

                if (board[x][y]) {
                    ans.add(Arrays.asList(x, y));
                    break;
                }
            }
        }

        return ans;
    }
}