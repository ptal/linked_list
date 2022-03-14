package ds;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ds.LinkedList;

class LinkedListTest {
    
    private LinkedList list;
    
    @BeforeEach
    void init() {
        list = new LinkedList();
    }
    
    void populate() {
        list.add(4);
        list.add(5);
        list.add(6);
    }
    
    void testListContent(int size, String content) {
        assertEquals(list.toString(), content);
        assertEquals(list.size(), size);
        assertEquals(list.isEmpty(), size == 0);
    }
    
    @Test
    @DisplayName("Clear elements in LinkedList")
    void testClear() {
        testListContent(0, "");
        populate();
        list.clear();
        testListContent(0, "");
    }
    
    @Test
    @DisplayName("Add elements in LinkedList")
    void testAdd() {
        populate();
        testListContent(3, "4, 5, 6");
        list.add(10, 2);
        testListContent(4, "4, 5, 10, 6");
    }
    
    @Test
    @DisplayName("Remove elements in LinkedList")
    void testRemove() {
        populate();
        list.remove(1);
        testListContent(2, "4, 6");
        list.remove(1);
        testListContent(1, "4");
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.remove(1));
        list.remove(0);
        testListContent(0, "");
    }

}
