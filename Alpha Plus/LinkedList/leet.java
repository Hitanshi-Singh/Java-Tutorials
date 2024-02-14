package LinkedList;

public class leet {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode tail=null;
        ListNode num1 = l1;
        ListNode num2 = l2;
        int sum;
        int carry = 0;
        while (num1 != null && num2 != null) {
            sum = num1.val + num2.val;
            sum = sum + carry;
            carry = sum / 10;
            sum %= 10;
            head = addLast(head,tail, sum);
            num1 = num1.next;
            num2 = num2.next;

        }
        while (num1 != null) {
            sum = num1.val + carry;
            carry = sum / 10;
            sum = sum % 10;
            head = addLast(head,tail, sum);

        }
        while (num2 != null) {
            sum = num2.val + carry;
            carry = sum / 10;
            sum = sum % 10;
            head = addLast(head,tail, sum);

        }
        return head;

    }

    ListNode addFirst(ListNode head, int data) {
        if (head == null) {
            ListNode newNode = new ListNode(data, null);
            head = newNode;

        } else {

            ListNode newNode = new ListNode(data, head);
            head = newNode;
        }
        return head;

    }
    ListNode addLast(ListNode head, ListNode tail,int data) {
        if (head == null) {
            ListNode newNode = new ListNode(data, null);
            head = tail = newNode;

        } else {

            ListNode newNode = new ListNode(data, null);
            tail.next=newNode;
            tail=newNode;
            
        }
        return head;

    }

    public void print(ListNode head) {
        if (head == null) {
            System.out.println("ll is empty");
            return;
        }

        for (ListNode i = head; i != null; i = i.next) {
            System.out.print(i.val + "->");
        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        leet ll = new leet();
        ListNode l1 = null, l2 = null;
        l1 = ll.addFirst(l1, 3);
        l1 = ll.addFirst(l1, 4);
        l1 = ll.addFirst(l1, 2);
        ll.print(l1);
        l2 = ll.addFirst(l2, 4);
        l2 = ll.addFirst(l2, 6);
        l2 = ll.addFirst(l2, 5);
        ll.print(l2);
        ListNode head = ll.addTwoNumbers(l1, l2);
        ll.print(head);

    }
}
