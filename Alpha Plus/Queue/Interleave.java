package Queue;

import java.util.*;

public class Interleave {
    public static void input(Queue<Integer> s, int size) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements : ");
        for (int i = 0; i < size; i++) {
            s.add(sc.nextInt());
        }
    }

    public static void split(Queue<Integer> s1, Queue<Integer> s2, int size) {
        int half = size / 2;
        // int half = s1.size();
        for (int i = 0; i < half; i++) {
            s2.add(s1.poll());
        }
    }

    public static void interleave(Queue<Integer> q1, Queue<Integer> q2) {
        while (!q2.isEmpty()) {
            q1.add(q2.remove());
            q1.add(q1.remove());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        System.out.print("Enter the size of stack (Even size only) : ");
        int size = sc.nextInt();
        input(q1, size);
        split(q1, q2, size);
        interleave(q1, q2);
        System.out.println(q1);
        while (!q1.isEmpty()) {
            System.out.print(q1.remove() + "\t");
        }
        sc.close();

    }

}
