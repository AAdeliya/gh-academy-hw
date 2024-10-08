
public class SudokuSolver {
    public void solveSudoky(char[][] board ) {
        if (board.length == 0 || board == null) {
            return;
        }

        solve(board);

    }

    public boolean solve(char[][] board) {
        for (int i = 0; i<board.length; i++) {
            for (int j=0; j<board[0].length; j++) {
                if (board[i][j] == '.') {
                    for (char c = '1'; c <= '9'; c++) {
                        if (isValid(board, i, j, c)) {
                            board[i][j] = c;
                            if (solve(board)) {
                                return true;

                            } else {
                                board [i][j] = '.';

                            }
                        }
                    }

                        return false;
                    }
                }
            }

            return true;
        }

        private boolean isValid(char[][] board, int row, int col, char c) {
            for ( int i = 0; i<9; i ++) {
               if (board[col][i] != '.' && board[col][i] == c) return false;
               if (board[i][row] != '.' && board[i][row] == c) return false;
               if (board [3 * (row/3) + i/3][ 3 * (col/3) + i%3] != '.' && 
               board [ 3* (row/3) +i/3] [3*(col/3) + i%3] == c) return false;
             }
            return true;


        }
    }
   
