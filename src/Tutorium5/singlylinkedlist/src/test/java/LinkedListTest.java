package Tutorium5.singlylinkedlist.src.test.java;

import java.util.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
    private final List<Integer> list = new LinkedList<Integer>();

    @BeforeEach
    void testEmptiness() {
        assertTrue(list.isEmpty());
    }

    @Test
    void testInserts() {
        list.add(1);
        assertFalse(list.isEmpty());
        assertTrue(list.contains(1));
    }

    @Test
    void testMultipleInserts() {
        for (int i = 0; i < 100; i++)
            list.add(i);

        for (int i = 0; i < 100; i++)
            assertTrue(list.contains(i));
    }

    @Test
    void testGet() {
        for (int i = 100; i < 200; i++)
            list.add(i);

        for (int i = 0; i < 100; i++)
            assertEquals(i + 100, list.get(i));
    }

    @Test
    void testSize() {
        for (int i = 0; i < 100; i++) {
            list.add(i);
            assertEquals(i + 1, list.size());
        }
    }

    @Test
    void testRemove() {
        for (int i = 0; i < 100; i++)
            list.add(i);

        Integer[] deletableElements = {0, 32, 42, 99};
        Set<Integer> deletableElementsSet = new HashSet<>(Arrays.asList(deletableElements));

        for (int deletable : deletableElements) {
            assertTrue(list.contains(deletable));
            list.delete(deletable);
            assertFalse(list.contains(deletable));
        }

        // check that all other elements can still be found in the list
        for (int i = 0; i < 100; i++) {
            if (deletableElementsSet.contains(i)) continue;
            assertTrue(list.contains(i));
        }
    }
}