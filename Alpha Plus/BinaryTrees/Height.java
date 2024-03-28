package BinaryTrees;

public class Height {
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

    public static int findHeight(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = findHeight(root.left);
        int rh = findHeight(root.right);
        int height = Math.max(lh, rh) + 1;
        return height;
    }

    public static void main(String[] args) {

        /*
         *        1
         *       / \
         *      2  3
         *    / \ / \
         *   4  5 6  7
         *  / 
         * 8
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        Node l4=root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        l4.left=new Node(8);
        System.out.println(findHeight(root));
    }
}
