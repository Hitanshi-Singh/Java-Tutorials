public class NQueens_2 {
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        if (nQueens(board, 0))
            printBoard(board);
        else
            System.out.println("No Solutions");
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

    public static boolean nQueens(char board[][], int row) {
        // base case
        if (row == board.length) {
            // printBoard(board);
            return true;

        }
        // no two queens in same row
        for (int i = 0; i < board.length; i++) {
            // is safe
            if (isSafe(board, row, i)) {
                board[row][i] = 'Q';
                if (nQueens(board, row + 1))
                    return true;
                board[row][i] = 'x';
            }
        }
        return false;
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
