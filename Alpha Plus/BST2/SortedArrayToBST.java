package BST2;

public class SortedArrayToBST {
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

    public static void preorder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);

    }

    public static Node buildMinHeight(int arr[], int s, int e) {// s=start, e=end
        if (s > e)
            return null;
        int mid = (s + e) / 2;

        Node root = new Node(arr[mid]);
        root.left = buildMinHeight(arr, s, mid - 1);
        root.right = buildMinHeight(arr, mid + 1, e);
        return root;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 6, 8, 10, 11, 14 };
        Node root = buildMinHeight(arr, 0, arr.length - 1);
        preorder(root);

    }
}
