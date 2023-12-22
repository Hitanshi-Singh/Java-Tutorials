// package 27_ArrayList;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        System.out.println(list);// works :)
        System.out.println(list.get(3));
        System.out.println(list.size());
        System.out.println(list.remove(4));
        System.out.println(list);
    }
}
