class Solution {
    public String tictactoe(int[][] moves) {
        int[][] board = new int[3][3];
        for (int i = 0; i < moves.length; i++) {
            int row = moves[i][0];
            int col = moves[i][1];
            board[row][col] = (i % 2 == 0) ? 1 : 2;
        }
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != 0 &&
                board[i][0] == board[i][1] &&
                board[i][1] == board[i][2]) {

                return board[i][0] == 1 ? "A" : "B";
            }
        }
        for (int j = 0; j < 3; j++) {
            if (board[0][j] != 0 &&
                board[0][j] == board[1][j] &&
                board[1][j] == board[2][j]) {

                return board[0][j] == 1 ? "A" : "B";
            }
        }
        if (board[0][0] != 0 &&
            board[0][0] == board[1][1] &&
            board[1][1] == board[2][2]) {
            return board[0][0] == 1 ? "A" : "B";
        }
        if (board[0][2] != 0 &&
            board[0][2] == board[1][1] &&
            board[1][1] == board[2][0]) {
            return board[0][2] == 1 ? "A" : "B";
        }
        if (moves.length == 9) {
            return "Draw";
        }

        return "Pending";
    }
}