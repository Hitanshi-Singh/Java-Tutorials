import java.util.*;

public class TrapRainWater {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 7;

        int a[] = new int[n];
        System.out.println("Enter elements : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int left[] = new int[n];
        int right[] = new int[n];
        trappedWater(a, left, right);
        sc.close();
    }

    public static void setBoundary(int a[], int left[], int right[]) {
        int leftMax = a[0];
        int rightMax = a[a.length - 1];
        int i;
        for (i = 0; i < a.length; i++) {
            if (a[i] > leftMax)
                leftMax = a[i];
            left[i] = leftMax;

        }
        for (i = a.length - 1; i >= 0; i--) {
            if (a[i] > rightMax)
                rightMax = a[i];
            right[i] = rightMax;
        }
    }

    public static void trappedWater(int a[], int left[], int right[]) {
        setBoundary(a, left, right);
        int vol = 0;
        for (int i = 0; i < a.length; i++) {
            int min = Math.min(left[i], right[i]);
            int level = min - a[i];
            if (level < 0)
                level = 0;
            vol = vol + level;
        }
        System.out.println(vol);

    }
}