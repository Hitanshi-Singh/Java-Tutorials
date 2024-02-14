package Stack;

import java.util.*;

public class PushBottom {
    public static void pushLast(Stack<Integer> s, int x) {
        if (s == null) {
            s.push(x);
            return;
        }
        int val = s.peek();
        s.pop();
        pushLast(s, x);
        s.push(val);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);
        pushLast(s, 4);
        while (!s.isEmpty()) {
            System.out.println(s.pop());

        }
    }
}
