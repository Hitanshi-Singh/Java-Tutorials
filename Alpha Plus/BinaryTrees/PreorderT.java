//Bulding tree using preordersequence given

package BinaryTrees;

import java.util.*;

public class PreorderT {
    public static class Node {
        int data;
        Node right, left;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;// returning the root of the tree
        }

        // level order traversal
        public static void level(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {

                Node x = q.remove();
                if (x == null) {
                    System.out.println();
                    if (q.isEmpty())
                        break;
                    else
                        q.add(null);
                } else {
                    System.out.print(x.data+"\t");
                    if (x.left != null)
                        q.add(x.left);
                    if (x.right != null)
                        q.add(x.right);
                }

            }

        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        // BinaryTree tree=new BinaryTree();
        Node root = BinaryTree.buildTree(nodes);
        
        BinaryTree.level(root);
    }
}
