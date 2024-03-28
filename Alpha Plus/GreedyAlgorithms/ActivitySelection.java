package GreedyAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
    public static void main(String[] args) {
        // int start[] = { 1, 3, 0, 5, 8, 5 };
        // int end[] = { 2, 4, 6, 7, 9, 9, };
        ArrayList<Integer> index = new ArrayList<>();// will store the indexes of the Activity we can do

        // when the array is not sorted end time wise
        int start[] = { 0, 1, 3, 5, 5, 8 };
        int end[] = { 6, 2, 4, 7, 9, 9 };

        // Sorting
        int activities[][] = new int[end.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        int maxAct = 0;
        // lambda function ->shortform
        Arrays.sort(activities, Comparator.comparingDouble(o ->o[2]));

        // 1st Activity
        maxAct = 1;
        int lastEnd = activities[0][2];// int lastEnd = end[0];
        index.add(activities[0][0]);// index.add(0); // First actitvity will always be there coz it ends first

        // End time basis sorted
        for (int i = 1; i < end.length; i++) {
            if (activities[i][1] >= lastEnd) {
                maxAct++;
                index.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }
        System.out.println("Max number of Activities are : " + maxAct);
        System.out.println("The activites are : " + index);
    }
}
