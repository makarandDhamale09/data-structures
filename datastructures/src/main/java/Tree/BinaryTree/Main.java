package Tree.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    BinaryTreeLL binaryTree = new BinaryTreeLL();
    List<BinaryNode> binaryNodes = new ArrayList<>();
    for (int i = 1; i < 10; i++) {
      BinaryNode node = new BinaryNode();
      node.value = "N" + i;
      binaryNodes.add(node);
    }
    binaryNodes.get(0).left = binaryNodes.get(1);
    binaryNodes.get(0).right = binaryNodes.get(2);
    binaryNodes.get(1).left = binaryNodes.get(3);
    binaryNodes.get(1).right = binaryNodes.get(4);
    binaryNodes.get(2).left = binaryNodes.get(5);
    binaryNodes.get(2).right = binaryNodes.get(6);
    binaryNodes.get(3).left = binaryNodes.get(7);
    binaryNodes.get(3).right = binaryNodes.get(8);
    binaryTree.root = binaryNodes.get(0);

    System.out.println("\nPreOrder traversal :");
    binaryTree.preOrder(binaryTree.root);

    System.out.println("\nInOrder traversal :");
    binaryTree.inOrder(binaryTree.root);

    System.out.println("\nPostOrder traversal :");
    binaryTree.postOrder(binaryTree.root);

    System.out.println("\nLevelOrder traversal :");
    binaryTree.levelOrder();

    System.out.println("\nSearch for value in tree :");
    binaryTree.search("N5");

    System.out.println("\nInsert Node :");
    binaryTree.insertNode("N10");
    binaryTree.levelOrder();

    System.out.println("\nGet Deepest Node :");
    System.out.println(binaryTree.getDeepestNode().value);

    System.out.println("\n\nDelete Deepest nodes :");
    binaryTree.deleteDeepestNode();
    binaryTree.levelOrder();

    System.out.println("\nDelete node N3 :");
    binaryTree.deleteNode("N3");
    binaryTree.levelOrder();

    binaryTree.deleteBinaryTree();
  }
}
