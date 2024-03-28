package Queue;

import java.util.Scanner;

public class CircularQ {
    static int front = -1;
    static int rear = -1;
    static int size = 6;

    // CircularQ(int size) {
    // this.size = size;
    // }

    public static boolean isFull() {
        return front == (rear + 1) % size;
    }

    public static void add(int arr[], int item) {
        if (rear == -1) {
            front = rear = 0;
            arr[front] = item;
            return;
        }
        if (!isFull()) {
            rear = (rear + 1) % size;
            arr[rear] = item;
        } else
            System.out.println("Queue Overflow!!!");

    }

    public static void remove(int arr[]) {
        if (front == -1) {
            System.out.println("Queue Underflow!!!");
            return;
        }
        if (front == rear) {
            System.out.println("Element removed is : " + arr[front]);
            front = rear = -1;
        } else {
            System.out.println("Element removed is : " + arr[front]);
            front = (front + 1) % size;
        }
    }

    static void display(int arr[]) {
        if (front == -1) {
            System.out.println("Nothing to Print!");
        }
        int i;
        for (i = front; i != rear; i = (i + 1) % size) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println(arr[i]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[6];
        System.out.println("1. add\n2. remove\n3. display\n4. Exit");
        while (true) {
            System.out.print("Enter your choice : ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter the element : ");
                    add(arr, sc.nextInt());
                    break;
                case 2:
                    remove(arr);
                    break;
                case 3:
                    display(arr);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice ! ");
                    break;
            }
        }
    }
}