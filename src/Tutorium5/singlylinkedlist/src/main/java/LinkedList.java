package Tutorium5.singlylinkedlist.src.main.java;

// This class stores elements of type E in nodes. Each node has a link to the next node (if exists).
public class LinkedList<E> implements List<E> {

    private static class Node<E> {
        E data;
        Node<E> next;
    }

    public int size() {
        // todo
        return 42;
    }

    // is this list empty?
    public boolean isEmpty() {
        return rootNode == null;
    }

    // does the list contain the specified element
    public boolean contains(Object element) {
        // todo
        return false;
    }

    // add the passed element to the lists end
    public void add(E element) {
        // todo
    }

    // get the element stored at the provided index
    public E get(int index) {
        // todo
        return null;
    }

    // delete the element if it is found in the list, return if it was found and deleted
    public boolean delete(E element) {
        // todo
        return false;
    }

    // this is the root node of the list
    private Node<E> rootNode;
}