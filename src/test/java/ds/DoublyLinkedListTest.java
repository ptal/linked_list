package ds;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DoublyLinkedListTest {

  private DoublyLinkedList list;

  @BeforeEach
  void init() {
    list = new DoublyLinkedList();
  }

  void populate() {
    list.add(4);
    list.add(5);
    list.add(6);
  }

  void testArrayContent(int size, String content) {
    assertEquals(content, list.toString());
    assertEquals(size, list.size());
    assertEquals(size == 0, list.isEmpty());
  }

  @Test
  @DisplayName("Clear elements in LinkedList")
  public void testClear() {
    testArrayContent(0, "");
    populate();
    list.clear();
    testArrayContent(0, "");
  }

  @Test
  @DisplayName("Search for an element in LinkedList")
  public void testIndexOf() {
    populate();
    assertEquals(1, list.indexOf(5));
    assertEquals(-1, list.indexOf(10));
  }

  @Test
  @DisplayName("Add elements in LinkedList")
  public void testAdd() {
    populate();
    testArrayContent(3, "4, 5, 6");
    list.add(10, 2);
    testArrayContent(4, "4, 5, 10, 6");
  }

  @Test
  @DisplayName("Remove elements in LinkedList")
  public void testRemove() {
    populate();
    list.remove(1);
    testArrayContent(2, "4, 6");
    list.remove(1);
    testArrayContent(1, "4");
    assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.remove(1));
    list.remove(0);
    testArrayContent(0, "");
  }
}
