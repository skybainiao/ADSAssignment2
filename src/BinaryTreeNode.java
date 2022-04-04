public class BinaryTreeNode<E extends Comparable<E>>
{

  private E element;

  private BinaryTreeNode<E> leftChild;

  private BinaryTreeNode<E> rightChild;


  public BinaryTreeNode(E element){
    this.element=element;
    this.rightChild=null;
    this.leftChild=null;
  }

  public BinaryTreeNode(){}

  public BinaryTreeNode(BinaryTreeNode<E> leftChild,E element,BinaryTreeNode<E> rightChild){
    this.element=element;
    this.leftChild=leftChild;
    this.rightChild=rightChild;

  }

  public void setElement(E element)
  {
    this.element = element;
  }

  public void setLeftChild(BinaryTreeNode<E> leftChild)
  {
    this.leftChild = leftChild;
  }

  public void setRightChild(BinaryTreeNode<E> rightChild)
  {
    this.rightChild = rightChild;
  }

  public BinaryTreeNode<E> getLeftChild()
  {
    return leftChild;
  }

  public BinaryTreeNode<E> getRightChild()
  {
    return rightChild;
  }

  public E getElement()
  {
    return element;
  }
}
