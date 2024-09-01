package GreedyAlgorithms;
import java.util.*;

public class Chocola {
    public static void main(String[] args) {
        int n=4,m=6;
        Integer costVer[]={2,1,3,1,4};//m-1
        Integer costHor[]={4,1,2};//n-1
        System.out.println(chocolate(costVer, costHor, m, n));
    }

    public static int chocolate(Integer x[], Integer y[], int m, int n) {
        int h = 1, v = 1, h1 = 0, v1 = 0;
        int cost = 0;
        Arrays.sort(x, Collections.reverseOrder());
        Arrays.sort(y, Collections.reverseOrder());
        while (v < m && h < n) {
            if (x[v1] > y[h1]) {
                v++;
                cost += x[v1++] * h;
            } else {
                h++;
                cost += y[h1++] * v;
            }
        }
        for (int i = v1; i < x.length; i++) {
            cost += x[i] * h;
        }
        for (int i = h1; i < y.length; i++) {
            cost += y[i] * v;
        }
        return cost;
    }
}
