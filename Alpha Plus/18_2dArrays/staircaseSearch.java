import java.util.*;

class staircaseSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        System.out.println("enter the elements");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = sc.nextInt();
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        search(a, 3, 3, 5);
    }

    public static void search(int a[][], int r, int c, int key) {
        int x = 0;
        int y = c - 1;
        while (x <= r && y >= 0) {
            if (a[x][y] == key) {
                System.out.println("Key found at (" + x + "," + y + ")");
                break;
            } else if (a[x][y] > key) {
                y--;
            } else {
                x++;
            }
        }
    }
}