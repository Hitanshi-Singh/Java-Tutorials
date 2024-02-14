package LinkedList;

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {

        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void insertAtPos(int index, int data) {
        Node temp = head;
        if (index == 1) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        for (int i = 1; i < index - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            return val;

        }
        int val = head.data;
        head = head.next;
        size--;
        return val;

    }

    public int removeLast() {
        int val = tail.data;
        Node temp = head;
        while (temp.next.next != null)
            temp = temp.next;
        tail = temp;
        tail.next = null;
        size--;
        return val;
    }

    public int searchByKey(int key) {
        Node temp = head;
        for (int i = 1; i <= size; i++) {
            if (temp.data == key)
                return i;
            temp = temp.next;
        }
        return -1;
    }

    public int searchByKeyRecursive(Node temp, int key, int count) {
        if (count > size || size == 0)
            return -1;
        if (temp.data == key)
            return count;
        return searchByKeyRecursive(temp.next, key, ++count);
    }

    public void reverse() {
        if (size == 0) {
            System.out.println("The list is empty, can't be reversed");
            return;
        }
        if (size == 1)
            return;
        Node prev = null;
        Node cur = head;
        Node temp = head.next;

        while (cur != null) {
            cur.next = prev;
            prev = cur;
            cur = temp;
            if (temp != null)
                temp = temp.next;

        }
        tail = head;
        head = prev;

    }

    // removing nth node from the end
    public int removeNode(int n) {
        if (n > size || n < 0) {
            System.out.println("Dumbass! 'n' n doesn't exist.");

        }
        Node temp = head;
        for (int i = 1; i < size - n; i++) {
            temp = temp.next;
        }
        int value = temp.next.data;
        temp.next = temp.next.next;
        return value;
    }

    public void print() {
        if (head == null) {
            System.out.println("ll is empty");
            return;
        }

        for (Node i = head; i != null; i = i.next) {
            System.out.print(i.data + "->");
        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.print();
        // ll.addFirst(4);
        // ll.addFirst(2);
        // ll.print();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        // ll.insertAtPos(1, 999);
        ll.print();
        // ll.removeFirst();
        // ll.removeLast();
        ll.print();

        int pos = ll.searchByKeyRecursive(head, 4, 1);
        System.out.println(pos);
        ll.reverse();
        ll.print();
        System.out.println(size);
        int x = ll.removeNode(2);
        System.out.println("the removed node is : " + x);
        ll.print();

    }
}
