package Array;

import java.util.*;

class hello {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<Integer> list = new ArrayList<>(10);
            System.out.println("enter the array");
            for (int i = 0; i < 3; i++) {
                System.out.println("enter element" + (i + 1));
                list.add(sc.nextInt());
            }
            for (int i = 0; i < 3; i++) {
                System.out.println(list.get(i));
            }
        }

    }
}