import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest
{
  BinarySearchTree tree;
  BinarySearchTreeNode root;

  @BeforeEach
  void setUp(){
    tree = new BinarySearchTree();
    root = new BinarySearchTreeNode(10);
    tree.setRoot(root);
  }

  @Test
  void insert() {
    assertTrue(tree.insert(3));

  }

  @Test
  void removeElement() {
    root.setLeftChild(new BinarySearchTreeNode(5));
    root.getLeftChild().setLeftChild(new BinarySearchTreeNode(2));
    root.getLeftChild().getLeftChild().setLeftChild(new BinarySearchTreeNode(1));
    root.getLeftChild().getLeftChild().setRightChild(new BinarySearchTreeNode(3));
    root.getLeftChild().setRightChild(new BinarySearchTreeNode(7));
    root.getLeftChild().getRightChild().setLeftChild(new BinarySearchTreeNode(6));
    root.getLeftChild().getRightChild().setRightChild(new BinarySearchTreeNode(8));
    root.setRightChild(new BinarySearchTreeNode(17));
    root.getRightChild().setLeftChild(new BinarySearchTreeNode(13));
    root.getRightChild().getLeftChild().setLeftChild(new BinarySearchTreeNode(11));
    root.getRightChild().getLeftChild().setRightChild(new BinarySearchTreeNode(15));
    root.getRightChild().setRightChild(new BinarySearchTreeNode(19));
    root.getRightChild().getRightChild().setLeftChild(new BinarySearchTreeNode(18));
    root.getRightChild().getRightChild().setRightChild(new BinarySearchTreeNode(23));

    assertTrue(tree.removeElement(7));
  }

  @Test
  void findMin() {
    root.setLeftChild(new BinarySearchTreeNode(5));
    root.getLeftChild().setLeftChild(new BinarySearchTreeNode(2));
    root.getLeftChild().getLeftChild().setLeftChild(new BinarySearchTreeNode(1));
    root.getLeftChild().getLeftChild().setRightChild(new BinarySearchTreeNode(3));
    root.getLeftChild().setRightChild(new BinarySearchTreeNode(7));
    root.getLeftChild().getRightChild().setLeftChild(new BinarySearchTreeNode(6));
    root.getLeftChild().getRightChild().setRightChild(new BinarySearchTreeNode(8));
    root.setRightChild(new BinarySearchTreeNode(17));
    root.getRightChild().setLeftChild(new BinarySearchTreeNode(13));
    root.getRightChild().getLeftChild().setLeftChild(new BinarySearchTreeNode(11));
    root.getRightChild().getLeftChild().setRightChild(new BinarySearchTreeNode(15));
    root.getRightChild().setRightChild(new BinarySearchTreeNode(19));
    root.getRightChild().getRightChild().setLeftChild(new BinarySearchTreeNode(18));
    root.getRightChild().getRightChild().setRightChild(new BinarySearchTreeNode(23));

    assertEquals(tree.findMin(), 1);
  }

  @Test
  void findMax() {
    root.setLeftChild(new BinarySearchTreeNode(5));
    root.getLeftChild().setLeftChild(new BinarySearchTreeNode(2));
    root.getLeftChild().getLeftChild().setLeftChild(new BinarySearchTreeNode(1));
    root.getLeftChild().getLeftChild().setRightChild(new BinarySearchTreeNode(3));
    root.getLeftChild().setRightChild(new BinarySearchTreeNode(7));
    root.getLeftChild().getRightChild().setLeftChild(new BinarySearchTreeNode(6));
    root.getLeftChild().getRightChild().setRightChild(new BinarySearchTreeNode(8));
    root.setRightChild(new BinarySearchTreeNode(17));
    root.getRightChild().setLeftChild(new BinarySearchTreeNode(13));
    root.getRightChild().getLeftChild().setLeftChild(new BinarySearchTreeNode(11));
    root.getRightChild().getLeftChild().setRightChild(new BinarySearchTreeNode(15));
    root.getRightChild().setRightChild(new BinarySearchTreeNode(19));
    root.getRightChild().getRightChild().setLeftChild(new BinarySearchTreeNode(18));
    root.getRightChild().getRightChild().setRightChild(new BinarySearchTreeNode(23));

    assertEquals(tree.findMax(), 23);
  }
}