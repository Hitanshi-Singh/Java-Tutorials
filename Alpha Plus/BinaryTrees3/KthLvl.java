package BinaryTrees3;

public class KthLvl {
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
    public static void findKLevel(Node root,int level,int k){
        if(root==null){
            return;
        }
        if(level==k){
            System.out.println(root.data);
            return ;
        }
        findKLevel(root.left, level+1, k);
        findKLevel(root.right, level+1, k);
        
    }
    public static void main(String[] args) {

        /*
         *            1
         *           / \
         *          2   3
         *         / \ / \
         *        4  5 6  7
         *       /   \
         *      8    9
         *     /      \
         *    12       10
         *             \
         *              11
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        Node l4=root.left.left = new Node(4);
        Node l5=root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        l4.left=new Node(8);
        l4.left.left=new Node(12);
        l5.right=new Node(9);
        l5.right.right=new Node(10);
        l5.right.right.right=new Node(11);

        findKLevel(root, 1, 5);
    }

}
