package GreedyAlgorithms;
//the code for sorting isnt here. i have assumed it is already sorted
import java.util.ArrayList;

public class FractionalKnapsack {
    public static void main(String[] args) {
        double value[] = { 60, 100, 120 };
        double weight[] = { 10, 20, 30 };
        int w = 50;
        ArrayList<Double> ratio = new ArrayList<>();
        for (int i = 0; i < value.length; i++) {
            ratio.add(value[i] / weight[i]);
        }
        // since the ratio wala array already in descending order
        int capacity = w, val = 0;
        int i;
        for (i = 0; i < value.length; i++) {
            if (capacity >= weight[i]) {
                capacity -= weight[i];
                val += value[i];

            } else {
                val += capacity * ratio.get(i);
                break;
            }
        }
        System.out.println("The max value is : " + val);
    }
}
