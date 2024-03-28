package BinaryTrees;

public class CountOfNodes {
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

    public static int getCount(Node root) {
        if (root == null)
            return 0;
        int leftCount = getCount(root.left);
        int rightCount = getCount(root.right);
        int count = leftCount + rightCount + 1;
        return count;

    }

    public static void main(String[] args) {

        /*
         * 1
         * / \
         * 2 3
         * / \ / \
         * 4 5 6 7
         * /
         * 8
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        Node l4 = root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        l4.left = new Node(8);
        System.out.println(getCount(root));
    }

}
