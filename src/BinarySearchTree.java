import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree<E extends Comparable<E>> extends BinaryTree
{

  private BinarySearchTreeNode root;

  public BinarySearchTree(){}

  public boolean insert(E e) {

    if (root == null)
      root = createNewNode(e); // Create a new root
    else {
      // Locate the parent node
      BinarySearchTreeNode parent = null;
      BinarySearchTreeNode current = root;
      while (current != null) {
        if (e.compareTo((E) current.getElement()) < 0) {
          parent = current;
          current = (BinarySearchTreeNode) current.getLeftChild();
        }
        else if (e.compareTo((E) current.getElement()) > 0) {
          parent = current;
          current = (BinarySearchTreeNode) current.getRightChild();
        }
        else
          return false;
      }
      if (e.compareTo((E) parent.getElement()) < 0)
        parent.setLeftChild(createNewNode(e));
      else
        parent.setRightChild(createNewNode(e)); ;
    }
    return true;
  }

  protected BinarySearchTreeNode<E> createNewNode(E e){
    return new BinarySearchTreeNode<>(e);
  }


  public boolean removeElement(E element) {
    BinarySearchTreeNode parent= null;
    BinarySearchTreeNode child = root;

    while(child!=null){
      if(element.compareTo((E) child.getElement())<0){
        parent = child;
        child = (BinarySearchTreeNode) child.getLeftChild();
      }
      else if(element.compareTo((E) child.getElement())>0){
        parent = child;
        child = (BinarySearchTreeNode) child.getRightChild();
      }
      else{
        break;
      }
    }
    if(child == null){
      return false;
    }

    if(child.getLeftChild() == null){
      if(parent==null){
        root = (BinarySearchTreeNode) child.getRightChild();
      }
      else{
        if(element.compareTo((E) parent.getElement())<0)
          parent.setLeftChild(child.getRightChild());
        else
          parent.setRightChild(child.getRightChild());
      }
    }
    else{
      BinarySearchTreeNode parentOfRightMost = child;
      BinarySearchTreeNode rightMost = (BinarySearchTreeNode) child.getLeftChild();

      while(rightMost.getRightChild() !=null){
        parentOfRightMost = rightMost;
        rightMost = (BinarySearchTreeNode) rightMost.getRightChild();
      }
      child.setElement(rightMost.getElement());

      if(parentOfRightMost.getRightChild() == rightMost)
        parentOfRightMost.setRightChild(rightMost.getLeftChild());
      else
        parentOfRightMost.setLeftChild(rightMost.getLeftChild());
    }
    setSize(getSize()-1);
    return true;
  }



  public E findMin(){
    BinarySearchTreeNode temp = (BinarySearchTreeNode) this.getRoot();
    while(temp.getLeftChild()!=null){
      temp = (BinarySearchTreeNode) temp.getLeftChild();
    }
    return (E) temp.getElement();
  }

  public E findMax(){

    Queue<BinarySearchTreeNode> queue = new LinkedList<>();
    queue.add((BinarySearchTreeNode) this.getRoot());
    E max = (E) this.getRoot().getLeftChild().getElement();

    while(!queue.isEmpty()){
      BinarySearchTreeNode temp = queue.poll();
      if(temp.compareTo(max)>0){
        max = (E) temp.getElement();
      }
      if(temp.getLeftChild()!=null){
        queue.add((BinarySearchTreeNode) temp.getLeftChild());
      }
      if(temp.getRightChild()!=null){
        queue.add((BinarySearchTreeNode) temp.getRightChild());
      }
    }
    return max;
  }


}
