public class GridWays {
    static int count = 0;
    static int n = 3;
    static int m = 3;

    public static void main(String[] args) {
        findGridWays(0, 0);
        // int grid[][] = new int[n][n];
        // findGridWays(grid, 0, 0);
        System.out.println(count);
    }

    /*
     * public static void findGridWays(int grid[][], int row, int col) {
     * if (row == grid.length - 1 && col == grid.length - 1) {
     * count++;
     * return;
     * }
     * if (row < grid.length - 1)
     * // go down
     * findGridWays(grid, row + 1, col);
     * if (col < grid.length - 1)
     * // go right
     * findGridWays(grid, row, col + 1);
     * 
     * }
     */
    public static void findGridWays(int row, int col) {
        if (row == m - 1 && col == n - 1) {
            count++;
            return;
        }
        if (row < m - 1)
            // go down
            findGridWays(row + 1, col);
        if (col < n - 1)
            // go right
            findGridWays(row, col + 1);

    }
}
