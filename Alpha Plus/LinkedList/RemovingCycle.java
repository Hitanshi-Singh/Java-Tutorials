package LinkedList;

public class RemovingCycle {
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

    // Method to remove cycle from a list
    public void removeCycle() {
        // detect cycle
        // point the slow pointer to head
        Node slow = head;
        Node fast = detectCycle();
        System.out.println(fast.data);
        Node prev = head;
        if (fast != null) {
            while (fast != slow) {
                prev = fast;
                slow = slow.next;
                fast = fast.next;
            }
            // lastNode.next=null
            System.out.println(prev.next.data);
            prev.next = null;
        }

    }

    public Node detectCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return fast;
        }
        return null;
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
        RemovingCycle ll = new RemovingCycle();
        // ll.addFirst(4);
        // ll.addFirst(3);
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.print();
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = head.next;
        ll.removeCycle();
        ll.print();
    }
}
