package BST1;

import java.util.ArrayList;

public class RootToLeafPaths {
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

    public static void findPath(ArrayList<Integer> path, Node root) {
        if (root == null)
            return;
        path.add(root.data);
        if (root.left == null && root.right == null) {
            for (int i = 0; i < path.size(); i++) {
                System.out.print(path.get(i) + "-");
            }
            System.out.println();
            
        }
        findPath(path, root.left);

        findPath(path, root.right);
        path.remove(path.size() - 1);

    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(14);
        findPath(new ArrayList<>(), root);
    }
}
