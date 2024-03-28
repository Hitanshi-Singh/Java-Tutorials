import java.util.*;

 class StackException extends Exception {
    StackException(String str) {
        super(str);
    }
}

class Stack {
    private int[] stk;
    private int tos;

    Stack(int size) {
        stk = new int[size];
        tos = -1;
    }

    void push(int item) throws StackException {
        if (tos == stk.length - 1)
            throw new StackException("Stack Overflow");
        else {
            stk[++tos] = item;
            
        }
    }

    void pop() throws StackException {
        if (tos == -1)
            throw new StackException("Stack Underflow");
        else
            tos--;
    }

    void display() throws StackException {
        if (tos == -1)
            throw new StackException("Stack Empty");
        else {

            for (int i = tos; i >= 0; i--) {
                System.out.print(stk[i] + "\t");
            }
            System.out.println();
        }
    }

}

public class StackClass1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Stack : ");
        int size = sc.nextInt();
        Stack s = new Stack(size);
        int ch;
        while (true) {
            System.out.println("\n\n********Menu*********\n1. push\n2. pop\n3. peek\n4. display\n5. exit");
            System.out.print("Enter your choice : ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter the value to be pushed : ");
                    try {
                        s.push(sc.nextInt());
                    } catch (StackException e) {
                        System.out.println("Exception Caught : " + e);
                    }

                    break;
                case 2:
                    try {
                        s.pop();
                    } catch (StackException e) {
                        System.out.println("Exception caught : " + e);
                    }
                    break;
                case 4:
                    try {
                        s.display();
                    } catch (StackException e) {
                        System.out.println("Exception caught : " + e);

                    }
                default:
                    break;
            }
        }
    }
}