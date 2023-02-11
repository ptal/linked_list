package ds;

public class DoublyLinkedList {
  private Node head;
  private int size;

  public DoublyLinkedList() {
    head = null;
    size = 0;
  }

  public void add(int x) {}

  public void add(int x, int idx) {}

  public void remove(int idx) {}

  public int indexOf(int x) {
    return 0;
  }

  public boolean isEmpty() {
    return false;
  }

  public int size() {
    return 0;
  }

  public void clear() {}

  public int[] toArray() {
    return null;
  }

  public String toString() {
    return null;
  }

  private static class Node {
    private int value;
    private Node prev;
    private Node next;

    private Node(int x) {
      this(x, null, null);
    }

    private Node(int x, Node prev, Node next) {
      value = x;
      this.prev = prev;
      this.next = next;
    }
  }
}
