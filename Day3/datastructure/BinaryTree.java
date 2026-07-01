package datastructure;

public class BinaryTree {

    private class Node {
        private int data;
        private Node left, right;

        public Node(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }
    }

    private Node root;

    // Insert a node
    public void add(int data) {

        Node n = new Node(data);

        if (root == null) {
            root = n;
            return;
        }

        Node t = root;

        while (true) {

            if (data == t.data)
                break;

            if (data > t.data) {

                if (t.right == null) {
                    t.right = n;
                    break;
                } else {
                    t = t.right;
                }
            }

            else {

                if (t.left == null) {
                    t.left = n;
                    break;
                } else {
                    t = t.left;
                }
            }
        }
    }

    // Public print method
    public void print() {
        print(root);
    }

    // Recursive inorder traversal
    private void print(Node root) {

        if (root != null) {

            print(root.left);
            System.out.println(root.getData());
            print(root.right);
        }
    }
}