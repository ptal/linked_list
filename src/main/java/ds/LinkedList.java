package ds;

/**
 * Implementation of a sequential-access list data structure.
 *
 */
public class LinkedList {
    private Node head;
    private int size;
    
    public LinkedList() {
        head = null;
        size = 0;
    }

    /**
     * Add a value at the end of the list.
     * @param x value to add at the end of the list
     */
    public void add(int x) {
      Node newNode = new Node(x);
      if (size == 0) {
          head = newNode;
      } else {
          Node n = head;
          while (n.nextNode != null) {
              n = n.nextNode;
          }
          n.nextNode = new Node(x);
      }
      size += 1;
    }
    
    /* write other methods here */
    
    /** This is an "inner-class". A class inside a class.
     *  It is useful to keep `Node` private as it is an implementation detail of linked list.
     *  By making `Node` an inner-class, we allow `LinkedList` to access the private members of `Node`.
     *  Check the concept of inner class online for more detail :-) */
    private class Node {
        private int value;
        private Node nextNode;
        
        private Node(int x) {
            value = x;
            nextNode = null;
        }
        
        private Node(int x, Node next) {
            value = x;
            nextNode = next;
        }
    }
}
