import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeNodeTest
{


  BinaryTreeNode node;

  @BeforeEach void setUp()
  {
    node = new BinarySearchTreeNode(null);
  }


  @Test void setElement()
  {
    node.setElement(2);
    assertEquals(node.getElement(), 2);
  }

  @Test void setLeftChild()
  {
    node.setLeftChild(new BinarySearchTreeNode(6));
    assertEquals(node.getLeftChild().getElement(), 6);
  }

  @Test void setRightChild()
  {
    node.setRightChild(new BinarySearchTreeNode(2));
    assertEquals(node.getLeftChild().getElement(), 2);
  }


}