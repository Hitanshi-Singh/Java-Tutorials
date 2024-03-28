package BST1;

import java.util.*;

public class Mirror {
    static class Node {
        int data;
        Node right;
        Node left;

        Node(int x) {
            data = x;
            left = null;
            right = null;
        }

    }

    public static void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);

    }

    public static void mirror(Node root) {
        if (root == null)
            return;
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirror(root.left);
        mirror(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(14);
        inorder(root);
        System.out.println();
        mirror(root);
        inorder(root);

    }
}
