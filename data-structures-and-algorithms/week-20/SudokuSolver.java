
public class SudokuSolver {
    public void solveSudoky(char[][] board ) {
        if (board == 0) || (board == null) return;
        solveSudoky(board);

    }

    public void solveSudoky(char[][] board, int row, int col) {
        for (int i = 0; i<board.length; i++) {
            for (int j=0; j<board[0].length; j++) {
                if (board[i][j] == '.') {
                    for (char c = '1'; c < '9'; c++) {
                        
                    }
                }




            }
        }
    }

    
}
