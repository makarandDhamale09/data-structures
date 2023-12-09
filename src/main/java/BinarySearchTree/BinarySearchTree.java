package main.java.BinarySearchTree;

public class BinarySearchTree {
    BinaryNode root;

    public BinarySearchTree() {
        root = null;
        System.out.println("BinarySearchTree created successfully");
    }

    // Insert Node
    private BinaryNode insert(BinaryNode currentNode, int value) {
        if (currentNode == null) {
            BinaryNode newNode = new BinaryNode();
            newNode.value = value;
            System.out.println("The value is successfully inserted");
            return newNode;
        }
        if (value <= currentNode.value) {
            currentNode.left = insert(currentNode.left, value);
        } else {
            currentNode.right = insert(currentNode.right, value);
        }
        return currentNode;
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    public void preOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
}
