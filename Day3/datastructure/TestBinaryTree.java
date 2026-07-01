package datastructure;

public class TestBinaryTree {

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        tree.add(50);
        tree.add(30);
        tree.add(70);
        tree.add(20);
        tree.add(40);
        tree.add(60);
        tree.add(80);

        System.out.println("Inorder Traversal:");

        tree.print();
    }
}