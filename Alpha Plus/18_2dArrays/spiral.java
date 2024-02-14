import java.util.*;

class spiral {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        System.out.println("enter the elements");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        printSpiral(a, 3, 3);
    }

    static void printSpiral(int a[][], int r, int c) {
        int startRow = 0, endRow = r - 1;
        int startCol = 0, endCol = c - 1;
        while (startRow <= endRow && startCol <= endCol) {

            // top
            for (int j = startCol; j <= endCol; j++)
                System.out.print(a[startRow][j] + "\t");
            // right
            for (int i = startRow + 1; i <= endRow; i++)
                System.out.print(a[i][startCol] + "\t");
            // bottom
            for (int j = endCol - 1; j >= startCol; j--)
                System.out.print(a[endRow][j] + "\t");
            // left
            for (int i = endRow - 1; i >= startRow + 1; i--)
                System.out.print(a[i][startCol] + "\t");
            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
        System.out.println();
        sc.close();
    }
}