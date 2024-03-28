package BinaryTrees2;

public class Subtree {
    static class Node {

        int data;
        Node left;
        Node right;

        Node(int d) {
            data = d;
            left = null;
            right = null;
        }
    }

    public static Node findSubNode(Node root, int key) {
        if (root == null) {
            return null;
        }
        if (root.data == key)
            return root;
        Node root1 = findSubNode(root.left, key);
        Node root2 = findSubNode(root.right, key);
        return root1 != null ? root1 : root2;
    }

    public static boolean containsSubtree(Node root, Node subroot) {
        if (root == null && subroot == null){
            return true;

        }
        else if (root == null || subroot == null||root.data!=subroot.data)
            return false;
        boolean x = containsSubtree(root.left, subroot.left);
        boolean y = containsSubtree(root.right, subroot.right);
        if (x == true && y == true)
            return true;
        return false;
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
        // try {
        // System.out.println(findSubNode(root, 55).data);

        // } catch (NullPointerException e) {
        // System.out.println("Null mein aagye ho tm ");
        // }

        // making the subtree to compare with

        Node subroot = new Node(3);
        subroot.left = new Node(6);
        subroot.right = new Node(7);

        Node newroot = findSubNode(root, 3);
        if (newroot != null) {
            System.out.println(containsSubtree(newroot, subroot));
        }
    }
}
