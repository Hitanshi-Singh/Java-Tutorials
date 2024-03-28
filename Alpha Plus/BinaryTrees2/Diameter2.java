package BinaryTrees2;

public class Diameter2 {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }

    }

    // Approach 2 with time Complexity =O(n)
    static class Info {
        int diam;
        int ht;

        Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info getDiameter(Node root) {
        if (root == null) {
            return new Info(0, 0);
        }
        Info leftInfo = getDiameter(root.left);
        Info rightInfo = getDiameter(root.right);
        int diameter = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
        int height = Math.max(leftInfo.ht, rightInfo.ht) + 1;
        return new Info(diameter, height);
    }

    public static void main(String[] args) {

        /*
         * 1
         * / \
         * 2 3
         * / \ / \
         * 4 5 6 7
         * / \
         * 8 9
         * \
         * 10
         * \
         * 11
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        Node l4 = root.left.left = new Node(4);
        Node l5 = root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        l4.left = new Node(8);
        l5.right = new Node(9);
        l5.right.right = new Node(10);
        l5.right.right.right = new Node(11);

        System.out.println(getDiameter(root).diam);// 8=>from node(11) to node(7)
    }
}
