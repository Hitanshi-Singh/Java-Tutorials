package Stack;

import java.util.*;

public class Reverse {
    public static void reverse(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int cur = s.pop();
        reverse(s);
        s = pushBottom(s, cur);
    }

    public static Stack<Integer> pushBottom(Stack<Integer> s, int x) {
        if (s.isEmpty()) {

            s.push(x);
            return s;
        } else {
            int cur = s.pop();
            pushBottom(s, x);
            s.push(cur);
            return s;
        }

    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(6);
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        reverse(s);
        while (!s.isEmpty()) {
            System.out.print(s.pop() + "\t");

        }
    }
}
