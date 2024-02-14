package LinkedList;

public class ZigZag {
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

    public void zigzag() {
        // get mid
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node rHead = slow.next;
        slow.next = null;
        // reversing the right part of list
        Node prev = null;
        Node curr = rHead;

        Node next = rHead.next;

        while (curr != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            if (curr != null)
                next = curr.next;

        }
        rHead = prev;

        // a dummy node
        Node newList = new Node(-1);
        // merge the left and right part
        Node temp = newList;
        while (rHead != null && head != null) {
            temp.next = head;
            temp = temp.next;
            head = head.next;
            temp.next = rHead;
            temp = temp.next;
            rHead = rHead.next;

        }
        temp.next = head;
        head = newList.next;
        // print(head);

    }

    public void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ZigZag ll = new ZigZag();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(6);
        ll.addFirst(7);
        ll.print(head);
        ll.zigzag();
        ll.print(head);
    }
}
