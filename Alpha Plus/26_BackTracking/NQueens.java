import java.util.Arrays;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        nQueens(board, 0);
    }

    public static void printBoard(char board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------");
    }

    public static void nQueens(char board[][], int row) {
        // base case
        if (row == board.length) {
            printBoard(board);

            return;

        }
        // no two queens in same row
        for (int i = 0; i < board.length; i++) {
            // is safe
            if (isSafe(board, row, i)) {
                board[row][i] = 'Q';
                nQueens(board, row + 1);
                board[row][i] = 'x';
            }
        }
    }

    public static boolean isSafe(char board[][], int row, int col) {
        // vertically up
        for (int i = row; i >= 0; i--) {
            if (board[i][col] == 'Q')
                return false;
        }

        // right diagonal up
        for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }

        // left diagonal up
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }
        return true;
    }

}
